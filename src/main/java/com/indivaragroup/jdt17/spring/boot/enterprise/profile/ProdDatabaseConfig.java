package com.indivaragroup.jdt17.spring.boot.enterprise.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDatabaseConfig {
    // config db mysql
}
