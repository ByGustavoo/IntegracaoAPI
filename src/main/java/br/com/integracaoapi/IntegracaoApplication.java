package br.com.integracaoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import static org.springframework.data.web.config.EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = VIA_DTO)
@PropertySource("file:${user.home}/integracaoapi/integracaoapi.properties")
public class IntegracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracaoApplication.class, args);
	}
}