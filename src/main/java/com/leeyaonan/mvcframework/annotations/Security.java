package com.leeyaonan.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * @Author leeyaonan
 * @Date 2020/5/5 22:17
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Security {

    String[] value() default {""};
}
