package br.com.integracaoapi.controller;

import br.com.integracaoapi.config.AbstractControllerTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootTest
class FornecedorControllerTest extends AbstractControllerTest {

    private String fornecedor;

    @BeforeEach
    void setUp() throws IOException {
        if (fornecedor == null) {
            fornecedor = new String(Files.readAllBytes(Paths.get("src/test/resources/fornecedor/fornecedor.json")));
        }
    }

    @Test
    @Order(1)
    void getAll() throws Exception {
        testGet("/fornecedor/v1");
    }

    @Test
    @Order(2)
    void getById() throws Exception {
        testGet("/fornecedor/v1/17");
    }

    @Test
    @Order(3)
    void getAllBySituacaoCadastro() throws Exception {
        testGet("/fornecedor/v1/situacao?descricao=ATIVO");
    }

    @Test
    @Order(4)
    void saveFornecedor() throws Exception {
        testPost("/fornecedor/v1", fornecedor);
    }

    @Test
    @Order(5)
    void updateFornecedor() throws Exception {
        testPatch("/fornecedor/v1/27", fornecedor);
    }

    @Test
    @Order(6)
    void deleteFornecedor() throws Exception {
        testDelete("/fornecedor/v1/213", fornecedor);
    }
}