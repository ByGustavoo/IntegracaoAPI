package br.com.integracaoapi.service;

import br.com.integracaoapi.config.AbstractTest;
import br.com.integracaoapi.model.dto.FornecedorDTO;
import br.com.integracaoapi.repository.FornecedorRepository;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Pageable;
import static org.assertj.core.api.Assertions.assertThat;

@Import(FornecedorService.class)
class FornecedorServiceTest extends AbstractTest {

    @Autowired
    private FornecedorService fornecedorService;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Test
    @Order(1)
    void findAll() {
        var fornecedores = fornecedorService.findAll(Pageable.unpaged());
        assertThat(fornecedores).isNotEmpty();
    }

    @Test
    @Order(2)
    void findFornecedorById() {
        var id = 17;
        var findFornecedor = fornecedorService.findFornecedorById(id);

        assertThat(findFornecedor).isNotNull();
        assertThat(findFornecedor.getId()).isEqualTo(id);
    }

    @Test
    @Order(3)
    void findFornecedorBySituacaoCadastroDescricao() {
        var descricao = "ATIVO";
        var fornecedores = fornecedorService.findFornecedorBySituacaoCadastroDescricao(descricao, Pageable.unpaged());

        assertThat(fornecedores).isNotEmpty();
        fornecedores.getContent().forEach(fornecedor ->
                assertThat(fornecedor.getSituacaoCadastro().getDescricao()).isEqualTo(descricao));
    }

    @Test
    @Order(4)
    void saveFornecedor() {
        var fornecedor = fornecedorRepository.getReferenceById(17);
        var fornecedorDTO = new FornecedorDTO(fornecedor);

        var fornecedorSalvo = fornecedorService.saveFornecedor(fornecedorDTO);

        assertThat(fornecedorSalvo).isNotNull();
        assertThat(fornecedorSalvo.getId()).isNotNull();
    }

    @Test
    @Order(5)
    void updateFornecedor() {
        var id = 17;
        var fornecedor = fornecedorRepository.getReferenceById(id);
        var fornecedorDTO = new FornecedorDTO(fornecedor);

        fornecedorDTO.setRazaoSocial("Fornecedor Atualizado");

        var fornecedorAtualizado = fornecedorService.updateFornecedor(id, fornecedorDTO);

        assertThat(fornecedorAtualizado).isNotNull();
        assertThat(fornecedorAtualizado.getRazaoSocial()).isEqualTo(fornecedorDTO.getRazaoSocial());
    }

    @Test
    @Order(6)
    void deleteFornecedor() {
        var id = 17;
        var fornecedorExcluido = fornecedorService.deleteFornecedor(id);

        assertThat(fornecedorExcluido).isNotNull();
        assertThat(fornecedorExcluido.getSituacaoCadastro().getDescricao()).isEqualTo("EXCLUIDO");
    }
}