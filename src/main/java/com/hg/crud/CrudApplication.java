package com.hg.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 
public class CrudApplication {

	@Bean
	  public Docket productsApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	          .apis(RequestHandlerSelectors.basePackage("com.hg.crud.controllers"))
	          .paths(PathSelectors.any())
	          .build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
