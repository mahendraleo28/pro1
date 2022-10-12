package com.infinite.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import exengine.EngineType;
import firstSpringEx.classes.CorollaBean;
import firstSpringEx.classes.SwiftBean;

@Configuration
@ComponentScan("Interfacecs")

public class AppConfig {
	
	@Bean("mySwift")
    public SwiftBean lamborghinin() {
        return new SwiftBean();
    }
    
    @Bean("myCorolla")
    public CorollaBean swift() {
        return new CorollaBean();
    }
    
    @Bean("v8Engine")
    public EngineType enginetypev8() {
        return  new EngineType("v8");
    }
    @Bean("v6Engine")
    public EngineType enginetypev6() {
        return  new EngineType("v6");
    }

}

