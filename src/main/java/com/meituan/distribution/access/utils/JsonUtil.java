package com.meituan.distribution.access.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class JsonUtil {

    private static final ObjectMapper mapper;
    private static final ObjectMapper mapperWithoutNull;

    static {
        // 初始化默认的ObjectMapper（默认包含null值）
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        // 初始化不包含null值的ObjectMapper
        mapperWithoutNull = new ObjectMapper();
        mapperWithoutNull.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapperWithoutNull.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapperWithoutNull.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }


    private JsonUtil() {
    }

    /**
     * 将对象转换为JSON字符串（默认包含null值）
     *
     * @param obj 要转换的对象
     * @return JSON字符串
     */
    public static String object2Json(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Convert object to JSON failed", e);
        }
    }
    /**
     * 将对象转换为JSON字符串，可以选择是否包含null值
     *
     * @param obj 要转换的对象
     * @param includeNull 是否包含null值
     * @return JSON字符串
     */
    public static String object2Json(Object obj, boolean includeNull) {
        try {
            return includeNull ? mapper.writeValueAsString(obj) : mapperWithoutNull.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Convert object to JSON failed", e);
        }
    }
    /**
     * 将JSON字符串转换为指定类型的对象
     *
     * @param json JSON字符串
     * @param clazz 目标类型
     * @param <T> 泛型类型
     * @return 转换后的对象
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, clazz);
        } catch (IOException e) {
            throw new RuntimeException("Parse JSON to object failed", e);
        }
    }

    /**
     * 将JSON字符串转换为复杂类型的对象
     *
     * @param json JSON字符串
     * @param typeReference 类型引用
     * @param <T> 泛型类型
     * @return 转换后的对象
     */
    public static <T> T fromJson(String json, TypeReference<T> typeReference) {
        try {
            return mapper.readValue(json, typeReference);
        } catch (IOException e) {
            throw new RuntimeException("Parse JSON to object failed", e);
        }
    }

    /**
     * 将JSON字符串转换为Map
     *
     * @param json JSON字符串
     * @return Map对象
     */
    public static Map<String, Object> toMap(String json) {
        try {
            return mapper.readValue(json, new TypeReference<Map<String, Object>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Parse JSON to Map failed", e);
        }
    }

    /**
     * 将JSON字符串转换为List
     *
     * @param json JSON字符串
     * @param clazz 列表元素类型
     * @param <T> 泛型类型
     * @return List对象
     */
    public static <T> List<T> toList(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, clazz));
        } catch (IOException e) {
            throw new RuntimeException("Parse JSON to List failed", e);
        }
    }

    /**
     * 获取默认的ObjectMapper实例（包含null值）
     *
     * @return ObjectMapper实例
     */
    public static ObjectMapper getObjectMapper() {
        return mapper;
    }
    /**
     * 获取不包含null值的ObjectMapper实例
     *
     * @return ObjectMapper实例
     */
    public static ObjectMapper getObjectMapperWithoutNull() {
        return mapperWithoutNull;
    }

}
