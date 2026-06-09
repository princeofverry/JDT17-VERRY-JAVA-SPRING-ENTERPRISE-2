package com.indivaragroup.jdt17.spring.boot.enterprise.value;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.author:Unknown}")
    private String appAuthor; // default: Unknown

    @Value("${server.port:8080}")
    private Integer serverPort;

    @PostConstruct
    public void printProperties() {
        System.out.println("Name : " + appName);
        System.out.println("Version : " + appVersion);
        System.out.println("Author : " + appAuthor);
        System.out.println("Port : " + serverPort);
    }
}
