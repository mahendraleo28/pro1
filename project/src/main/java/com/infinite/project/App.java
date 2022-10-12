package com.infinite.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import firstSpringEx.interfaces.Car;
@Configuration
@ComponentScan
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Car C = new Corolla();
       // Car D = new Swift();
        
       // System.out.println(C.specs());
       // System.out.println(D.specs());
    	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
          Car CorollaBean = context.getBean("myCorolla",Car.class);
          System.out.println(CorollaBean.specs());
          Car SwiftBean = context.getBean("mySwift",Car.class);
          System.out.println(SwiftBean.specs());
          context.close();
    }
}
