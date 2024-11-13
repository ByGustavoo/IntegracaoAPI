package br.com.integracaoapi.service;

import br.com.integracaoapi.model.dto.SituacaoCadastroDTO;
import br.com.integracaoapi.repository.SituacaoCadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SituacaoCadastroService {

    @Autowired
    private SituacaoCadastroRepository situacaoCadastroRepository;

    public List<SituacaoCadastroDTO> findAll() {
        return situacaoCadastroRepository.findAll().stream().map(SituacaoCadastroDTO::new).toList();
    }
}