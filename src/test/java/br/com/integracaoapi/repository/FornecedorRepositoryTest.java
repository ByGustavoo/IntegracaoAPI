package br.com.integracaoapi.repository;

import br.com.integracaoapi.config.JacksonConfiguration;
import br.com.integracaoapi.model.entity.Fornecedor;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DataJpaTest
@ActiveProfiles("test")
@Import(JacksonConfiguration.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class FornecedorRepositoryTest {

    private String fornecedor;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @BeforeEach
    void setUp() throws IOException {
        if (fornecedor == null) {
            fornecedor = new String(Files.readAllBytes(Paths.get("src/test/resources/fornecedor/createFornecedor.json")));
        }
    }

    @Test
    @Order(1)
    @DisplayName("Deve retornar todos os Fornecedores")
    void findAll() {
        var fornecedores = fornecedorRepository.findAll();
        assertThat(fornecedores).isNotEmpty();
    }

    @Test
    @Order(2)
    @DisplayName("Deve retornar o Fornecedor informado pelo ID")
    void findFornecedorById() {
        var id = 17;
        var findFornecedor = fornecedorRepository.findById(id);

        assertThat(findFornecedor).isNotEmpty();
        assertThat(findFornecedor.get().getId()).isEqualTo(id);
    }

    @Test
    @Order(3)
    @DisplayName("Deve retornar um erro ao consultar um Fornecedor que não existe")
    void findFornecedorByIdWithWrongId() {
        var id = 99999;
        var findFornecedor = fornecedorRepository.findById(id);

        assertThat(findFornecedor).isEmpty();
        assertThrows(EntityNotFoundException.class, () -> findFornecedor.orElseThrow(EntityNotFoundException::new));
    }

    @Test
    @Order(4)
    @DisplayName("Deve retornar todos os Fornecedores com a Situação Cadastro ATIVO")
    void findAllBySituacaoCadastroAtivo() {
        var fornecedoresAtivos = fornecedorRepository.findAllBySituacaoCadastroDescricao("ATIVO", Pageable.unpaged());
        assertThat(fornecedoresAtivos).isNotEmpty();

        fornecedoresAtivos.getContent().forEach(fornecedor ->
                assertThat(fornecedor.getSituacaoCadastro().getDescricao()).isEqualToIgnoringCase("ATIVO")
        );
    }

    @Test
    @Order(5)
    @DisplayName("Deve retornar todos os Fornecedores com a Situação Cadastro EXCLUIDO")
    void findAllBySituacaoCadastroExcluido() {
        var fornecedoresExcluidos = fornecedorRepository.findAllBySituacaoCadastroDescricao("EXCLUIDO", Pageable.unpaged());
        assertThat(fornecedoresExcluidos).isNotEmpty();

        fornecedoresExcluidos.getContent().forEach(fornecedor ->
                assertThat(fornecedor.getSituacaoCadastro().getDescricao()).isEqualToIgnoringCase("EXCLUIDO")
        );
    }

    @Test
    @Order(6)
    @DisplayName("Deve retornar vazio com a Situação Cadastro que não seja ATIVO ou EXCLUIDO")
    void findAllBySituacaoCadastroErrado() {
        var fornecedoresErrados = fornecedorRepository.findAllBySituacaoCadastroDescricao("TESTE", Pageable.unpaged());
        assertThat(fornecedoresErrados).isEmpty();
    }

    @Test
    @Order(7)
    @DisplayName("Deve salvar um Fornecedor")
    void saveFornecedor() {
        Assertions.assertDoesNotThrow(() -> {
            assertThat(fornecedor).isNotEmpty();

            var fornecedorToEntity = objectMapper.readValue(fornecedor, Fornecedor.class);

            var saveFornecedor = fornecedorRepository.save(fornecedorToEntity);

            assertThat(saveFornecedor).isNotNull();

            var findFornecedor = fornecedorRepository.findById(saveFornecedor.getId());
            assertThat(findFornecedor).isNotEmpty();
            assertThat(findFornecedor.get().getId()).isEqualTo(saveFornecedor.getId());
        });
    }
}