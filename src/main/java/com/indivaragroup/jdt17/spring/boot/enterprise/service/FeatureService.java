package com.indivaragroup.jdt17.spring.boot.enterprise.service;

import com.indivaragroup.jdt17.spring.boot.enterprise.config.FeatureProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // no need typing constructor
public class FeatureService {
    private final FeatureProperties featureProperties;

    public boolean isAttendanceEnabled() {
        return featureProperties.attendance();
    }

    public boolean isDirectSellingEnabled() {
        return featureProperties.directSelling();
    }

    public boolean isLoyaltyEnabled() {
        return featureProperties.loyalty();
    }
}
