package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmbeddedCollectionTest {

    @Autowired
    private AppEmbeddedProperties appEmbeddedProperties;

    @Test
    void testEmbeddedCollection() {
        List<AppEmbeddedProperties.ServerConfig> servers = appEmbeddedProperties.getServers();
        assertEquals(3, servers.size());

        AppEmbeddedProperties.ServerConfig primary = servers.get(0);
        assertEquals("server1.example.com", primary.getHost());
        assertEquals(8080, primary.getPort());
        assertEquals("Primary Server", primary.getName());

        System.out.println("Servers: " + servers.size());
    }
}
