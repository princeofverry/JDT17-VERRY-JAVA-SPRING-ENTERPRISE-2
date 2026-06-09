package com.indivaragroup.jdt17.spring.boot.enterprise.value;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppPropertiesTest {

    @Autowired
    private AppProperties appProperties;

    @Test
    void testPrintProperties() {
        appProperties.printProperties();
        // Output:
        // Name : Belajar Spring Boot
        // Version : 1.0.0
        // Author : Programmer Zaman Now
        // Port : 8080
    }
}
