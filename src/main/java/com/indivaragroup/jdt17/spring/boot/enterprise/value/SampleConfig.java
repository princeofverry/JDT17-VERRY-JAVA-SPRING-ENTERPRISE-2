package com.indivaragroup.jdt17.spring.boot.enterprise.value;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/sample.properties")
public class SampleConfig {

    @Value("${sample.name}")
    private String sampleName;

    @Value("${sample.version}")
    private String sampleVersion;

    @Value("${sample.author}")
    private String sampleAuthor;

    @PostConstruct
    public void printSampleConfig() {
        System.out.println("Name : " + sampleName);
        System.out.println("Version : " + sampleVersion);
        System.out.println("Author : " + sampleAuthor);
    }
}
