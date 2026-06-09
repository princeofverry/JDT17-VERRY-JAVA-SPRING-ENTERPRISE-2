package com.indivaragroup.jdt17.spring.boot.enterprise.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CollectionConfigPropertiesTest {

    @Autowired
    private AppCollectionProperties appCollectionProperties;

    @Test
    void testCollectionProperties() {
        List<String> servers = appCollectionProperties.getServers();

        System.out.println("Servers: " + servers);
        assertEquals(3, servers.size());

        Map<String, String> labels = appCollectionProperties.getLabels();
        System.out.println("Labels: " + labels);

        assertEquals("production", labels.get("env"));
    }
}
