package com.github.carlosraphael.javabeanutil.javabean;

import lombok.Builder;
import lombok.Value;

/**
 * @author carlos.raphael.lopes@gmail.com
 */
@Value @Builder
public class NestedJavaBean {

    private final String fieldA;
    private final NestedJavaBean nestedJavaBean;
}
