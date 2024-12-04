package br.com.integracaoapi.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    private static final String DESCRICAO = """
            A Integração API foi desenvolvida para proporcionar uma interação simplificada e eficiente com os dados
            armazenados no Banco de Dados. A API oferece funcionalidades completas para gerenciamento dos dados,
            incluindo operações de criação, leitura, atualização e exclusão (CRUD). Além disso, incorpora autenticação
            e autorização baseadas em tokens JWT, assegurando a proteção das operações e controlando o acesso aos
            endpoints disponíveis.
            """;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().components(new Components()
                        .addSecuritySchemes("Authorization",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                        .info(new Info()
                                .title("Integração API")
                                .description(DESCRICAO)
                        .contact(new Contact()
                                .name("Gustavo")
                                .email("gustavo.gcc05@hotmail.com"))
                        .license(new License()
                                .name("Massachusetts Institute of Technology License")
                                .url("https://github.com/ByGustavoo/IntegracaoAPI/blob/main/LICENSE")));
    }
}