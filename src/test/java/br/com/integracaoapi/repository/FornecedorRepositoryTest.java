package br.com.integracaoapi.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FornecedorRepositoryTest {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Test
    @DisplayName("Deve retornar todos os Fornecedores com a Situação Cadastro Ativo")
    void findAllBySituacaoCadastroAtivo() {
        var fornecedoresAtivos = fornecedorRepository.findAllBySituacaoCadastroDescricao("ATIVO", Pageable.unpaged());
        assertThat(fornecedoresAtivos).isNotEmpty();

        fornecedoresAtivos.getContent().forEach(fornecedor ->
                assertThat(fornecedor.getSituacaoCadastro().getDescricao()).isEqualToIgnoringCase("ATIVO")
        );
    }

    @Test
    @DisplayName("Deve retornar todos os Fornecedores com a Situação Cadastro de Excluído")
    void findAllBySituacaoCadastroExcluido() {
        var fornecedoresExcluidos = fornecedorRepository.findAllBySituacaoCadastroDescricao("EXCLUIDO", Pageable.unpaged());
        assertThat(fornecedoresExcluidos).isNotEmpty();

        fornecedoresExcluidos.getContent().forEach(fornecedor ->
                assertThat(fornecedor.getSituacaoCadastro().getDescricao()).isEqualToIgnoringCase("EXCLUIDO")
        );
    }

    @Test
    @DisplayName("Deve retornar vazio com a Situação Cadastro que não seja ATIVO ou EXCLUIDO")
    void findAllBySituacaoCadastroErrado() {
        var fornecedoresErrados = fornecedorRepository.findAllBySituacaoCadastroDescricao("TESTE", Pageable.unpaged());
        assertThat(fornecedoresErrados).isEmpty();
    }
}