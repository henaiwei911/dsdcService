package com.ds.hnw.dsgcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DsgcserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsgcserviceApplication.class, args);
    }

}
