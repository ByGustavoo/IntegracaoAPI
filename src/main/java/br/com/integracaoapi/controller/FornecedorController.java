package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.FornecedorDTO;
import br.com.integracaoapi.service.FornecedorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping("/v1")
    public Page<FornecedorDTO> findAll(@PageableDefault(size = 100, sort = {"id"}) Pageable pageable) {
        return fornecedorService.getFornecedor(pageable);
    }

    @GetMapping("/v1/{id}")
    public FornecedorDTO findById(@PathVariable Integer id) {
        return fornecedorService.getFornecedorById(id);
    }

    @GetMapping("/v1/situacao")
    public Page<FornecedorDTO> findAllBySituacaoCadastro(String descricao, @PageableDefault(size = 100, sort = {"id"}) Pageable pageable) {
        return fornecedorService.getFornecedorBySituacaoCadastroDescricao(descricao, pageable);
    }

    @PostMapping("/v1")
    @Transactional
    public void saveFornecedor(@RequestBody @Valid FornecedorDTO fornecedorDTO) {
        fornecedorService.saveFornecedor(fornecedorDTO);
    }

    @PatchMapping("/v1/{id}")
    @Transactional
    public void updateFornecedor(@PathVariable Integer id, @RequestBody @Valid FornecedorDTO fornecedorDTO) {
        fornecedorService.updateFornecedor(id, fornecedorDTO);
    }

    @DeleteMapping("/v1/{id}")
    @Transactional
    public void deleteFornecedor(@PathVariable Integer id) {
        fornecedorService.deleteFornecedor(id);
    }
}