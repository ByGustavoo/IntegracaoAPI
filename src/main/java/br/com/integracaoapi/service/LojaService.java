package br.com.integracaoapi.service;

import br.com.integracaoapi.model.dto.LojaDTO;
import br.com.integracaoapi.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public List<LojaDTO> findAll() {
        return lojaRepository.findAll().stream().map(LojaDTO::new).toList();
    }
}