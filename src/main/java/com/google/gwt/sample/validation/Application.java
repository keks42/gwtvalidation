package com.google.gwt.sample.validation;

import com.google.gwt.sample.validation.server.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new GreetingServiceImpl());
        bean.setUrlMappings(Arrays.asList("/validation/greet"));
        return bean;
    }
}
