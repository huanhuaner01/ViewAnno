package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 初始化组件的注解
 * 参数：id
 * Created by huanzhang on 2017/8/4.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface FindView {
    int value();
}
