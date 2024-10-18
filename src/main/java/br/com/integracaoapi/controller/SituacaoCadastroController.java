package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.SituacaoCadastroDTO;
import br.com.integracaoapi.service.SituacaoCadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/situacaocadastro")
public class SituacaoCadastroController {

    @Autowired
    SituacaoCadastroService situacaoCadastroService;

    @GetMapping("/v1")
    public List<SituacaoCadastroDTO> findAll() {
        return situacaoCadastroService.getSituacaoCadastro();
    }
}