package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
        Functional Requirement-005
 */

@ConfigurationProperties(prefix = "features")
public record FeatureProperties(
    boolean attendance,
    boolean directSelling,
    boolean loyalty
) {
}
