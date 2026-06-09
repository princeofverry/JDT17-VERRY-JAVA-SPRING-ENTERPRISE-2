package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DurationConverterTest {

    @Autowired
    private AppTimeoutProperties appTimeoutProperties;

    @Test
    void testDurationConversion() {
        Duration connectionTimeout = appTimeoutProperties.getConnectionTimeout();
        Duration sessionTimeout = appTimeoutProperties.getSessionTimeout();

        assertEquals(Duration.ofSeconds(5), connectionTimeout);
        assertEquals(Duration.ofMinutes(30), sessionTimeout);
        System.out.println("Connection Timeout: " + connectionTimeout.getSeconds() + "s");
        System.out.println("Session Timeout: " + sessionTimeout.toMinutes() + "m");
    }
}
