package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app")
public class AppCollectionProperties {
    private List servers = new ArrayList<>();
    private Map labels = new HashMap();

    public List getServers() { return servers; }
    public void setServers(List servers) { this.servers = servers; }
    public Map getLabels() { return labels; }
    public void setLabels(Map labels) { this.labels = labels; }
}
