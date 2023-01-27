package com.capgemini.examplerest.controller;

import com.capgemini.examplerest.dto.HealthCheck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping(produces = "application/json")
    public HealthCheck hello(){
        HealthCheck healthCheck = new HealthCheck();
        healthCheck.setMessage("hello world");
        return healthCheck;
    }


}
