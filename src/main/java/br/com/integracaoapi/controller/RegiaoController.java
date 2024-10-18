package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.RegiaoDTO;
import br.com.integracaoapi.service.RegiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/regiao")
public class RegiaoController {

    @Autowired
    RegiaoService regiaoService;

    @GetMapping("/v1")
    public List<RegiaoDTO> findAll() {
        return regiaoService.getAllRegions();
    }
}