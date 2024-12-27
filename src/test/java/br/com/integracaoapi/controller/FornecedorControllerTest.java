package br.com.integracaoapi.controller;

import br.com.integracaoapi.service.FornecedorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;
import java.util.Objects;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FornecedorControllerTest {

    @Autowired
    private FornecedorService fornecedorService;

    @Autowired
    private FornecedorController fornecedorController;

    @Test
    @Order(1)
    void findAll() {
        Assertions.assertDoesNotThrow(() -> {
            var fornecedores = fornecedorController.getAll(Pageable.unpaged());
            assertThat(fornecedores).isNotNull();
        });
    }

    @Test
    @Order(2)
    void findFornecedorById() {
        Assertions.assertDoesNotThrow(() -> {
            var id = 17;
            var findFornecedor = fornecedorController.getById(id);
            assertThat(findFornecedor).isNotNull();
            assertThat(Objects.requireNonNull(findFornecedor.getBody()).getId().equals(id));
        });
    }
}