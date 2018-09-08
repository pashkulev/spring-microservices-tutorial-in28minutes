package com.vankata.currencyconversionmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.vankata.currencyconversionmicroservice")
@EnableDiscoveryClient
public class CurrencyConversionMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionMicroserviceApplication.class, args);
    }
}
