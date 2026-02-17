package com.amalitech.nota.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final javax.sql.DataSource dataSource;

    public HealthController(javax.sql.DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/api/health")
    public java.util.Map<String, String> health() {
        boolean dbStatus = false;
        try (java.sql.Connection conn = dataSource.getConnection()) {
            dbStatus = conn.isValid(1);
        } catch (java.sql.SQLException e) {
            // Log error
        }

        return java.util.Map.of(
                "status", "UP",
                "database", dbStatus ? "UP" : "DOWN");
    }
}
