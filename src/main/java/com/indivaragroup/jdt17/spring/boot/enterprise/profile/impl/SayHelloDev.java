package com.indivaragroup.jdt17.spring.boot.enterprise.profile.impl;

import com.indivaragroup.jdt17.spring.boot.enterprise.profile.SayHello;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class SayHelloDev implements SayHello {
    @Override
    public String say(String name) {
        return "Hello " + name + " from DEV!";
    }
}
