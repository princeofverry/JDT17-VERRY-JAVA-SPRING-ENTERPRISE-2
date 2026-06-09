package com.indivaragroup.jdt17.spring.boot.enterprise.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
public class ProfileEnvironmentTest {

    @Autowired
    private ProfileChecker profileChecker;

    @Autowired
    private Environment environment;

    @Test
    void testCheckProfiles() {
        profileChecker.checkProfiles();
        // Output:
        // Active Profiles: [dev]
        // Is DEV active: true
        // Default Profiles: [default]
    }
}
