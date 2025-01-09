package br.com.integracaoapi.controller;

import br.com.integracaoapi.config.AbstractControllerTest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutenticacaoControllerTest extends AbstractControllerTest {

    private static final String USERNAME = "VRSoftware";
    private static final String PASSWORD = "integracao_@VRSoftware";

    @Test
    @Order(1)
    void singIn() throws Exception {
        String requestBody = "{ \"username\": %s, \"password\": %s }".formatted(USERNAME, PASSWORD);

        testPost("/auth", requestBody);
    }
}