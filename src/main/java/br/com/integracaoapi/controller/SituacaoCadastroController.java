package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.SituacaoCadastroDTO;
import br.com.integracaoapi.service.SituacaoCadastroService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Tag(name = "Situação Cadastro")
@RequestMapping("/situacaocadastro")
@SecurityRequirement(name = "Authorization")
public class SituacaoCadastroController {

    @Autowired
    private SituacaoCadastroService situacaoCadastroService;

    @GetMapping("/v1")
    public ResponseEntity<List<SituacaoCadastroDTO>> getAll() {
        return ResponseEntity.ok(situacaoCadastroService.findAll());
    }
}