package com.hkjin.paymentsettlementsys.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public ModelResolver modelResolver(ObjectMapper objectMapper){
		return new ModelResolver(objectMapper);
	}

	@Bean
	public OpenAPI openAPI() {
		Info info = new Info()
			.version("v1.0.0")
			.title("SettleMentsSystem API")
			.description("결제&정산 시스템");

		return new OpenAPI().info(info);
	}
}
