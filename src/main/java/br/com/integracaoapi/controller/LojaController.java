package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.entity.Loja;
import br.com.integracaoapi.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/loja")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping
    public List<Loja> findAllStores() {
        return lojaService.findAll();
    }
}