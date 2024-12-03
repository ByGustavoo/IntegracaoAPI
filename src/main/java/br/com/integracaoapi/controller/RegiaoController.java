package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.RegiaoDTO;
import br.com.integracaoapi.service.RegiaoService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Tag(name = "Região")
@RequestMapping("/regiao")
@SecurityRequirement(name = "Authorization")
public class RegiaoController {

    @Autowired
    private RegiaoService regiaoService;

    @GetMapping("/v1")
    public ResponseEntity<List<RegiaoDTO>> getAll() {
        return ResponseEntity.ok(regiaoService.findAll());
    }

    @PostMapping("/v1")
    @Transactional
    public ResponseEntity<?> saveRegion(@RequestBody @Valid RegiaoDTO regiaoDTO) {
        return ResponseEntity.ok(regiaoService.saveRegion(regiaoDTO));
    }

    @PatchMapping("/v1/{id}")
    @Transactional
    public ResponseEntity<?> updateRegion(@PathVariable Integer id, @RequestBody @Valid RegiaoDTO regiaoDTO) {
        return ResponseEntity.ok(regiaoService.updateRegion(id, regiaoDTO));
    }
}