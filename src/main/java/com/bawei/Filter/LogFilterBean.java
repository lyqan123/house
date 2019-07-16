package com.bawei.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class LogFilterBean {

    @Bean
    public FilterRegistrationBean logFilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        List list = new ArrayList<>();
        list.add("*");
        filterRegistrationBean.setUrlPatterns(list);
        return filterRegistrationBean;
    }
}
