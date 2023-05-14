package com.diaock.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger 配置
 * @author chengKun
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi userApi() {
        String[] paths = {"/**"};
        String[] packagedToMatch = {"com.diaock"};
        return GroupedOpenApi.builder().group("CK-TODO")
                .pathsToMatch(paths)
                .packagesToScan(packagedToMatch).build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        Contact contact = new Contact();
        contact.setName("chengKun");

        return new OpenAPI().info(new Info()
                .title("CK-TODO")
                .description("CK-TODO")
                .contact(contact)
                .version("3.0")
                .termsOfService("")
                .license(new License().name("MIT")
                        .url("")));
    }

}