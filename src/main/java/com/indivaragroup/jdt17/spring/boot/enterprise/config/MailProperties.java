package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import jakarta.validation.constraints.AssertTrue;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/*
        Functional Requirement-004
 */

@ConfigurationProperties(prefix = "mail")
@Validated
public record MailProperties(
        Boolean enabled,
        String host,
        Integer port
) {

    @AssertTrue(message = "Mail host and port required when enabled!")
    public boolean isValid() {
        if(Boolean.FALSE.equals(enabled)) {
            return true;
        }

        return host != null && !host.isBlank() && port != null;
    }
}
