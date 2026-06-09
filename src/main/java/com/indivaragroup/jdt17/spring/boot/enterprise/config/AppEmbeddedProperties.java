package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "app")
public class AppEmbeddedProperties {

    private List<ServerConfig> servers = new ArrayList<>();

    @Data
    public static class ServerConfig {
        private String host;
        private Integer port;
        private String name;
        // Getters and Setters...

    }
    public List<ServerConfig> getServers() {
        return servers;
    }
    public void setServers(List<ServerConfig> servers) {
        this.servers = servers;
    }
}
