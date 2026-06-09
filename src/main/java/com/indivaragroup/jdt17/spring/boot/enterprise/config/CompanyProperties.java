package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/*
        Functional Requirement-002
 */

@ConfigurationProperties(prefix = "company")
@Validated
public record CompanyProperties (
    @NotBlank
    String code,

    @NotBlank
    String name,

    @NotBlank
    String Timezone
) { }
