package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.LojaDTO;
import br.com.integracaoapi.service.LojaService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Tag(name = "Loja")
@RequestMapping("/loja")
@SecurityRequirement(name = "Authorization")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping("/v1")
    public ResponseEntity<List<LojaDTO>> getAll() {
        return ResponseEntity.ok(lojaService.findAll());
    }
}