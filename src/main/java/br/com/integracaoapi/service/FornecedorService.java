package br.com.integracaoapi.service;

import br.com.integracaoapi.model.dto.FornecedorDTO;
import br.com.integracaoapi.model.entity.Fornecedor;
import br.com.integracaoapi.model.entity.SituacaoCadastro;
import br.com.integracaoapi.repository.FornecedorRepository;
import br.com.integracaoapi.repository.SituacaoCadastroRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    @Autowired
    SituacaoCadastroRepository situacaoCadastroRepository;

    public Page<FornecedorDTO> findAll(Pageable pageable) {
        return fornecedorRepository.findAll(pageable).map(FornecedorDTO::new);
    }

    public FornecedorDTO findFornecedorById(Integer id) {
        Fornecedor findFornecedor = fornecedorRepository.getReferenceById(id);
        return new FornecedorDTO(findFornecedor);
    }

    public Page<FornecedorDTO> findFornecedorBySituacaoCadastroDescricao(String descricao, Pageable pageable) {
        return fornecedorRepository.findAllBySituacaoCadastroDescricao(descricao, pageable).map(FornecedorDTO::new);
    }

    public FornecedorDTO saveFornecedor(FornecedorDTO fornecedorDTO) {
        return new FornecedorDTO(fornecedorRepository.save(fornecedorDTO.toEntity()));
    }

    public FornecedorDTO updateFornecedor(Integer id, FornecedorDTO fornecedorDTO) {
        Fornecedor findFornecedor = fornecedorRepository.getReferenceById(id);

        BeanUtils.copyProperties(fornecedorDTO, findFornecedor, "id");
        return new FornecedorDTO(fornecedorRepository.save(findFornecedor));
    }

    public FornecedorDTO deleteFornecedor(Integer id) {
        Fornecedor findFornecedor = fornecedorRepository.getReferenceById(id);

        if (findFornecedor.getSituacaoCadastro().getId() == 1) {
            SituacaoCadastro situacaoExcluido = situacaoCadastroRepository.getReferenceById(0);

            findFornecedor.setSituacaoCadastro(situacaoExcluido);
            return new FornecedorDTO(fornecedorRepository.save(findFornecedor));
        }
        else {
            throw new RuntimeException("ERRO! O Fornecedor não pode ser deletado, pois o mesmo já se encontra excluído!");
        }
    }
}