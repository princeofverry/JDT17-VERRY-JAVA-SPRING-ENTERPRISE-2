package com.indivaragroup.jdt17.spring.boot.enterprise.startup;

import com.indivaragroup.jdt17.spring.boot.enterprise.config.CompanyProperties;
import com.indivaragroup.jdt17.spring.boot.enterprise.config.DatabaseProperties;
import com.indivaragroup.jdt17.spring.boot.enterprise.config.FeatureProperties;
import com.indivaragroup.jdt17.spring.boot.enterprise.config.MailProperties;
import com.indivaragroup.jdt17.spring.boot.enterprise.service.ReportTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class StartupReportRunner implements ApplicationRunner {
    private final CompanyProperties company;
    private final DatabaseProperties database;
    private final FeatureProperties feature;
    private final Environment environment;
    private final MessageSource messageSource;
    private final ReportTemplateService reportTemplateService;
    private final MailProperties mailProperties;

    // method for masking password
    private String maskPassword(String secret) {
        return "*".repeat(secret.length());
    }

    @Override
    public void run(ApplicationArguments args) {

        // checking env get active profile
        String profile = environment.getActiveProfiles().length > 0 ?
                environment.getActiveProfiles()[0] : "default";

        System.out.println(messageSource.getMessage(
                "welcome.message",
                null,
                Locale.ENGLISH));

        System.out.println(messageSource.getMessage(
                "welcome.message",
                null,
                Locale.of("id")
        ));


        System.out.println("""
===================================
Environment : %s
Company     : %s
Timezone    : %s

Features
---------
Attendance      : %s
Direct Selling  : %s
Loyalty         : %s

Mail            : %s

--------
Host        : %s
Username    : %s
Password    : %s

Database Password : ********
===================================
"""
                .formatted(
                        profile,
                        company.name(),
                        company.Timezone(),
                        feature.attendance()
                                ? "ENABLED"
                                : "DISABLED",
                        feature.directSelling()
                                ? "ENABLED"
                                : "DISABLED",
                        feature.loyalty()
                                ? "ENABLED"
                                : "DISABLED",
                        mailProperties.enabled()
                                ? "ENABLED"
                                : "DIDSABLED",
                        database.host(),
                        database.username(),
                        maskPassword(database.password())
                ));

        // if we call report template, we should use try and catch
        try {
            System.out.println(reportTemplateService.getReportTemplate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
