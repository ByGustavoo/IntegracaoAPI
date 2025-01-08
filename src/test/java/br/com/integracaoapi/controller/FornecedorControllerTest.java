package br.com.integracaoapi.controller;

import br.com.integracaoapi.config.AbstractControllerTest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FornecedorControllerTest extends AbstractControllerTest {

    @Test
    @Order(1)
    void findAll() throws Exception {
        testGet("/fornecedores");
    }
}