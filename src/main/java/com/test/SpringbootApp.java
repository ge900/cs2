package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fuxi100 on 2017/10/19.
 */
@SpringBootApplication
@Configuration
@ComponentScan
public class SpringbootApp extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApp.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(this.getClass());
    }
}
