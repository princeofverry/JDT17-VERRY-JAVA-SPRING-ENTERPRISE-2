package com.indivaragroup.jdt17.spring.boot.enterprise.service;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class ReportTemplateService {
    private final ResourceLoader resourceLoader;

    public String getReportTemplate() throws IOException {
        Resource resource = resourceLoader.getResource(
                "classpath:/templates/report-template.txt"
        );

        return resource.getContentAsString(StandardCharsets.UTF_8);
    }
}
