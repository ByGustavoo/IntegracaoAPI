package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.FornecedorDTO;
import br.com.integracaoapi.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping("/v1")
    public Page<FornecedorDTO> findAll(@PageableDefault(size = 100, sort = {"id"}) Pageable pageable) {
        return fornecedorService.getFornecedor(pageable);
    }
}