package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.RegiaoDTO;
import br.com.integracaoapi.service.RegiaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/regiao")
public class RegiaoController {

    @Autowired
    private RegiaoService regiaoService;

    @GetMapping("/v1")
    public ResponseEntity<List<RegiaoDTO>> findAll() {
        return ResponseEntity.ok(regiaoService.getAllRegions());
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