package com.wusuiwei.gmall.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GmallCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCmsApplication.class, args);
    }

}
