package br.com.pessoa.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Algum título aqui")
                        .version("v1")
                        .description("Alguma descrição aqui")
                        .termsOfService("https://urldostermosdeservicoaqui.com.br")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://algumaurlaqui.com.br")
                        )
                        .summary("Algum sumário aqui")
                );
    }
}
