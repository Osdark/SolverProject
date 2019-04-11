package com.ddd.generic;

public interface ObjectMapper {

    <T> T map(Object src, Class<T> target);
    <T> T map(T src);

}
