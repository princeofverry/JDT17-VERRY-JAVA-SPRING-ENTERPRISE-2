package com.indivaragroup.jdt17.spring.boot.enterprise.profile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@ActiveProfiles("dev")
public class ProfileDevTest {
    @Autowired
    private SayHello sayHello;

    @Test
    void testSayHelloDev() {
        String result = sayHello.say("World");
        assertEquals("Hello World from DEV!", result);
    }
}
