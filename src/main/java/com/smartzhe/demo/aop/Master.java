package com.smartzhe.demo.aop;

import java.lang.annotation.*;

/**
 * Created by luohuahua on 18/8/26.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Master {

}
