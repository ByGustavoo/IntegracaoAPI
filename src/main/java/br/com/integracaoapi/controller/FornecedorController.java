package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.FornecedorDTO;
import br.com.integracaoapi.service.FornecedorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping("/v1")
    public ResponseEntity<Page<FornecedorDTO>> getAll(@PageableDefault(size = 100, sort = {"id"}) Pageable pageable) {
        return ResponseEntity.ok(fornecedorService.findAll(pageable));
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<FornecedorDTO> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(fornecedorService.findFornecedorById(id));
    }

    @GetMapping("/v1/situacao")
    public ResponseEntity<Page<FornecedorDTO>> getAllBySituacaoCadastro(String descricao, @PageableDefault(size = 100, sort = {"id"}) Pageable pageable) {
        return ResponseEntity.ok(fornecedorService.findFornecedorBySituacaoCadastroDescricao(descricao, pageable));
    }

    @PostMapping("/v1")
    @Transactional
    public ResponseEntity<FornecedorDTO> saveFornecedor(@RequestBody @Valid FornecedorDTO fornecedorDTO) {
        return ResponseEntity.ok(fornecedorService.saveFornecedor(fornecedorDTO));
    }

    @PatchMapping("/v1/{id}")
    @Transactional
    public ResponseEntity<FornecedorDTO> updateFornecedor(@PathVariable Integer id, @RequestBody @Valid FornecedorDTO fornecedorDTO) {
        return ResponseEntity.ok(fornecedorService.updateFornecedor(id, fornecedorDTO));
    }

    @DeleteMapping("/v1/{id}")
    @Transactional
    public ResponseEntity<FornecedorDTO> deleteFornecedor(@PathVariable Integer id) {
        return ResponseEntity.ok(fornecedorService.deleteFornecedor(id));
    }
}