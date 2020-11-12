package com.rihua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Order83Main {
    public static void main(String[] args){
        SpringApplication.run(Order83Main.class,args);
    }
}
