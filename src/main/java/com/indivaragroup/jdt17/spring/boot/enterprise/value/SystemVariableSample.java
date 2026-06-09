package com.indivaragroup.jdt17.spring.boot.enterprise.value;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemVariableSample {

    @Value("${JAVA_HOME}")
    private String javaHome;

    @Value("${PATH}")
    private String path;

    @Value("${user.home}")
    private String userHome;

    @Value("${user.name}")
    private String userName;

    @PostConstruct
    public void printSystemVariables() {
        System.out.println("Java Home : " + javaHome);
        System.out.println("User Home : " + userHome);
        System.out.println("User Name : " + userName);
    }
}
