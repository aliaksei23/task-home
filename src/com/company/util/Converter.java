package com.company.util;

@FunctionalInterface
public interface Converter <T,M>{

    T convert(M element);
}
