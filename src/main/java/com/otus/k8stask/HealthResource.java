package com.otus.k8stask;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthResource {

    @GetMapping("/health")
    public HealthDTO getHealth() {
        return new HealthDTO("OK");
    }
}
