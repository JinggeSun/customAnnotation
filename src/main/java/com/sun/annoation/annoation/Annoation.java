package com.sun.annoation.annoation;


import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zcm
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Annoation {

    int value();
    int res();
}
