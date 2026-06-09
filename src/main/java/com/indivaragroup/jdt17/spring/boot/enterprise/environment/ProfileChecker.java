package com.indivaragroup.jdt17.spring.boot.enterprise.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ProfileChecker {

    @Autowired
    private Environment environment;

    public void checkProfiles() {
        // Mendapatkan active profiles
        String[] activeProfiles = environment.getActiveProfiles();
        System.out.println("Active Profiles: " + Arrays.toString(activeProfiles));

        // Mengecek profile tertentu
        boolean isDevActive = environment.acceptsProfiles(Profiles.of("dev"));
        System.out.println("Is DEV active: " + isDevActive);

        // Default profiles
        String[] defaultProfiles = environment.getDefaultProfiles();
        System.out.println("Default Profiles: " + Arrays.toString(defaultProfiles));
    }
}
