package no.ntnu.mycbr.rest;

import no.ntnu.mycbr.rest.controller.MyDefaultHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

//@Configuration
//@ComponentScan
//public class AppConfig extends WebMvcConfigurationSupport {
//    @Override
//    @Bean
//    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
//        RequestMappingHandlerMapping m = super.requestMappingHandlerMapping();
//        m.setDefaultHandler(new MyDefaultHandler());
//        return m;
//    }
//}
