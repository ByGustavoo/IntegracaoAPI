package br.com.integracaoapi.service;

import br.com.integracaoapi.model.dto.RegiaoDTO;
import br.com.integracaoapi.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RegiaoService {

    @Autowired
    RegiaoRepository regiaoRepository;

    public List<RegiaoDTO> getAllRegions() {
        return regiaoRepository.findAll().stream().map(RegiaoDTO::new).toList();
    }
}