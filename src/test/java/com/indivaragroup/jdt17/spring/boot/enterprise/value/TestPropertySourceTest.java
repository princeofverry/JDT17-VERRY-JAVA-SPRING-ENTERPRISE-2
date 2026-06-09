package com.indivaragroup.jdt17.spring.boot.enterprise.value;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:/test.properties")
public class TestPropertySourceTest {

    @Autowired
    private SampleConfig sampleConfig;

    @Test
    void testWithTestProperties() {
        sampleConfig.printSampleConfig();
    }
}
