package com.indivaragroup.jdt17.spring.boot.enterprise.value;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SystemVariableSampleTest {

    @Autowired
    private SystemVariableSample systemVariableSample;

    @Test
    void testSystemVariableSample() {
        systemVariableSample.printSystemVariables();
    }
}
