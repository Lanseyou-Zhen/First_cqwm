package com.sky.annotation;

/**
 * 自定义注解，用于标识方法进行功能字段自动日安冲
 */

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//作用于方法
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //枚举类型
    OperationType value();
}
