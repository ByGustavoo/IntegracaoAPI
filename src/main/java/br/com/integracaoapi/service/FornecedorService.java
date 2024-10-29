package br.com.integracaoapi.service;

import br.com.integracaoapi.exceptions.ResourceNotFoundException;
import br.com.integracaoapi.model.dto.FornecedorDTO;
import br.com.integracaoapi.model.entity.Fornecedor;
import br.com.integracaoapi.model.entity.SituacaoCadastro;
import br.com.integracaoapi.repository.FornecedorRepository;
import br.com.integracaoapi.repository.SituacaoCadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Autowired
    private SituacaoCadastroRepository situacaoCadastroRepository;

    public Page<FornecedorDTO> getFornecedor(Pageable pageable) {
        return fornecedorRepository.findAll(pageable).map(FornecedorDTO::new);
    }

    public Page<FornecedorDTO> getFornecedorBySituacaoCadastroDescricao(String descricao, Pageable pageable) {
        return fornecedorRepository.findAllBySituacaoCadastroDescricao(descricao, pageable).map(FornecedorDTO::new);
    }

    public void deleteFornecedor(Integer id) {
        Fornecedor findFornecedor = fornecedorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Fornecedor", id));

        if (findFornecedor.getSituacaoCadastro().getId() == 1) {
            SituacaoCadastro situacaoExcluido = situacaoCadastroRepository.getReferenceById(0);

            findFornecedor.setSituacaoCadastro(situacaoExcluido);
            fornecedorRepository.save(findFornecedor);
        }
        else {
            throw new RuntimeException("ERRO! O Fornecedor não pode ser deletado, pois o mesmo já se encontra excluído!");
        }
    }
}