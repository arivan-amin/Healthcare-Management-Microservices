package com.arivanamin.healthcare.backend.doctor.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import static com.arivanamin.healthcare.backend.core.domain.base.CoreApplicationConfig.BASE_PACKAGE;

@SpringBootApplication (scanBasePackages = BASE_PACKAGE)
@EntityScan (BASE_PACKAGE)
@EnableDiscoveryClient
@EnableCaching
public class DoctorApplication {
    
    public static void main (String[] args) {
        SpringApplication.run(DoctorApplication.class, args);
    }
}
