package com.ds.hnw.dsgcservice.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author teacher
 * @date 2019/9/25
 */
@Configuration
@EnableSwagger2
public class config {

    @Bean
    public Docket api() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(apiInfo())
                .pathMapping("/")
                .select() // 选择哪些路径和api会生成document
                .apis(RequestHandlerSelectors.any())// 对所有api进行监控
//                .apis(RequestHandlerSelectors.basePackage("com.hanstrovsky.controller"))// 选择监控的package
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))// 只监控有ApiOperation注解的接口
                //不显示错误的接口地址
                .apis(RequestHandlerSelectors.basePackage("com.ds.hnw.dsgcservice.controller"))
                .build();
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("XXXX项目接口文档")
                .contact(new Contact("Hanstrovsky", "www.hanstrovsky.com", "Hanstrovsky@gmail.com"))
                .description("这是用Swagger动态生成的接口文档")
                .termsOfServiceUrl("NO terms of service")
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0")
                .build();
    }
}

