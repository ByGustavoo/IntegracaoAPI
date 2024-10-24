package br.com.integracaoapi.service;

import br.com.integracaoapi.model.dto.FornecedorDTO;
import br.com.integracaoapi.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<FornecedorDTO> getFornecedor() {
        return fornecedorRepository.findAll().stream().map(FornecedorDTO::new).toList();
    }
}