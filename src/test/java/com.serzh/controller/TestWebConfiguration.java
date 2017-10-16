package com.serzh.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author sergii.zagryvyi on 16.10.2017
 */
@Configuration
//TODO: added support for https://stackoverflow.com/questions/34981198/spring-mvc-configuration-with-enablewebmvc-and-webmvcconfigureradapter-for-stat
@EnableWebMvc
@ComponentScan(basePackages = {"com.serzh.controller"})
public class TestWebConfiguration extends WebMvcConfigurerAdapter {

//    @Bean
//    public BookMapper bookMapper() {
//        return mock(BookMapper.class);
//    }
//
//    @Bean
//    public BookController bookController() {
//        return new BookController(bookMapper());
//    }

}
