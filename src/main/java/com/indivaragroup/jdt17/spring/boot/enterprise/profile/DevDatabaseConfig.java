package com.indivaragroup.jdt17.spring.boot.enterprise.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatabaseConfig {
    // config h2 untuk dev
}
