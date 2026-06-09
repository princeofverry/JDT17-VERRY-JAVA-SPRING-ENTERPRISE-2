package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

// konversi properties ke type data
@Data
@ConfigurationProperties(prefix = "app")
public class AppTimeoutProperties {
    private Duration connectionTimeout;
    private Duration readTimeout;
    private Duration sessionTimeout;
}
