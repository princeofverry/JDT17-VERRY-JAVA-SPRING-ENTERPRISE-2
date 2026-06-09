package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/*
        Functional Requirement-003
 */

@ConfigurationProperties(prefix = "database")
@Validated
public record DatabaseProperties (
    @NotBlank
    String host,

    @Min(1)
    @Max(65535)
    Integer port,

    @NotBlank
    String username,

    @NotBlank
    String password
) {}
