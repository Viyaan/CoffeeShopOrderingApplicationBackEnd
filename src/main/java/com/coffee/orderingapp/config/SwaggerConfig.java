package com.coffee.orderingapp.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
		
		// code review

	    @Bean
	    public Docket apiDocket() {
	        return new Docket(DocumentationType.SWAGGER_2)
	        		.select()
	                .apis(RequestHandlerSelectors.basePackage("com.coffee.orderingapp.controller"))
	                .paths(PathSelectors.any())
	                .build()
	                .apiInfo(getApiInfo());
	    }
	   

private ApiInfo getApiInfo() {
    return new ApiInfo(
            "Coffee Ordering App",
            "The app is use to place order / track status given by Customers",
            "1",
            "TERMS OF SERVICE URL",
            new Contact("Vipin","vipin.com","vipin@gmail.com"),
            "MIT",
            "LICENSE URL",
            Collections.emptyList()
    );
}
	    

}
