package br.com.integracaoapi.repository;

import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FornecedorRepositoryTest {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Test
    @DisplayName("Deve retornar todos os fornecedores")
    void findAll() {
        var fornecedores = fornecedorRepository.findAll();
        assertThat(fornecedores).isNotEmpty();
    }

    @Test
    @DisplayName("Deve retornar o fornecedorDTO informado pelo ID")
    void findFornecedorById() {
        var id = 17;
        var findFornecedor = fornecedorRepository.findById(id);

        assertThat(findFornecedor).isNotEmpty();
        assertThat(findFornecedor.get().getId()).isEqualTo(id);
    }

    @Test
    @DisplayName("Deve retornar um erro ao consultar um fornecedorDTO que não existe")
    void findFornecedorByIdWithWrongId() {
        var id = 99999;
        var findFornecedor = fornecedorRepository.findById(id);

        assertThat(findFornecedor).isEmpty();
        assertThrows(EntityNotFoundException.class, () -> findFornecedor.orElseThrow(EntityNotFoundException::new));
    }

    @Test
    @DisplayName("Deve retornar todos os fornecedores com a situação cadastro ativo")
    void findAllBySituacaoCadastroAtivo() {
        var fornecedoresAtivos = fornecedorRepository.findAllBySituacaoCadastroDescricao("ATIVO", Pageable.unpaged());
        assertThat(fornecedoresAtivos).isNotEmpty();

        fornecedoresAtivos.getContent().forEach(fornecedor ->
                assertThat(fornecedor.getSituacaoCadastro().getDescricao()).isEqualToIgnoringCase("ATIVO")
        );
    }

    @Test
    @DisplayName("Deve retornar todos os fornecedores com a situação cadastro excluído")
    void findAllBySituacaoCadastroExcluido() {
        var fornecedoresExcluidos = fornecedorRepository.findAllBySituacaoCadastroDescricao("EXCLUIDO", Pageable.unpaged());
        assertThat(fornecedoresExcluidos).isNotEmpty();

        fornecedoresExcluidos.getContent().forEach(fornecedor ->
                assertThat(fornecedor.getSituacaoCadastro().getDescricao()).isEqualToIgnoringCase("EXCLUIDO")
        );
    }

    @Test
    @DisplayName("Deve retornar vazio com a situação cadastro que não seja ATIVO ou EXCLUIDO")
    void findAllBySituacaoCadastroErrado() {
        var fornecedoresErrados = fornecedorRepository.findAllBySituacaoCadastroDescricao("TESTE", Pageable.unpaged());
        assertThat(fornecedoresErrados).isEmpty();
    }

    @Test
    @DisplayName("Deve salvar um fornecedorDTO")
    void saveFornecedor() {
        // TODO

    }
}