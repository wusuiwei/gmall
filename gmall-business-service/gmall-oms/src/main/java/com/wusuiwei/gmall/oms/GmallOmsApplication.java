package com.wusuiwei.gmall.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GmallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallOmsApplication.class, args);
    }

}
