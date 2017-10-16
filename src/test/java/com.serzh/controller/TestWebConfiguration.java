package com.serzh.controller;

import com.serzh.Application;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author sergii.zagryvyi on 16.10.2017
 */
@Configuration
//TODO: added support for https://stackoverflow.com/questions/34981198/spring-mvc-configuration-with-enablewebmvc-and-webmvcconfigureradapter-for-stat
@EnableWebMvc
//@ComponentScan(basePackages = {"com.serzh.controller"})
@ContextConfiguration(classes = {Application.class})
public class TestWebConfiguration extends WebMvcConfigurerAdapter {

//    @Bean
//    public BookMapper bookMapper() {
//        return mock(BookMapper.class);
//    }
//
    @Bean
    public GreetingController greetingController() {
        return new GreetingController();
    }

}
