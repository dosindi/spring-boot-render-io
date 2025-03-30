/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootdocker;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;

/**
 *
 * @author Admin
 */
@Configuration
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
      // Including all static resources.

      registry.addResourceHandler("/assets/**", 
                  "/css/**", 
                  "/img/**",
                  "/js/**",
                  "/**",
                  "/webjars/**",
                  "/**"
             ).addResourceLocations("/assets/",
                  "/css/", 
                  "/img/",
                  "/js/",
                  "classpath:/webapp/",
                  "/webjars/",
                  "classpath:/templates/**"   
      ).resourceChain(true)
       .addResolver(new PathResourceResolver());

       super.addResourceHandlers(registry);
  }
}
