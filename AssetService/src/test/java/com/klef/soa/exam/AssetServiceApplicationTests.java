package com.klef.soa.exam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
    "spring.datasource.url=jdbc:postgresql://localhost:5432/soa-skill-exam-2400090175",
    "spring.datasource.username=postgres",
    "spring.datasource.password=exam123"
})
class AssetServiceApplicationTests {

    @Test
    void contextLoads() {
    }
}