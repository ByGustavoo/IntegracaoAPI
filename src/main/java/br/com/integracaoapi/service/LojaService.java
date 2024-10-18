package br.com.integracaoapi.service;

import br.com.integracaoapi.model.entity.Loja;
import br.com.integracaoapi.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public List<Loja> findAll() {
        return lojaRepository.findAll();
    }
}