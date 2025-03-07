package com.example.dummyjson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    private final String status = "status";
    private final String up = "UP";

    @GetMapping()
    public Map<String, String> health() {
        return Map.of(status, up);
    }
}
