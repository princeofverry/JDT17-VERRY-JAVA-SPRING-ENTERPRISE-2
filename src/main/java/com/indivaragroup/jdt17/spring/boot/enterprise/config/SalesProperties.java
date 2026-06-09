package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "sales.route")
@Validated
public record SalesProperties(

        @Min(50)
        @Max(500)
        Integer maxOutletPerRoute
) {
}
