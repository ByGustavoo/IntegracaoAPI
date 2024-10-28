package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.RegiaoDTO;
import br.com.integracaoapi.service.RegiaoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regiao")
public class RegiaoController {

    @Autowired
    private RegiaoService regiaoService;

    @GetMapping("/v1")
    public List<RegiaoDTO> findAll() {
        return regiaoService.getAllRegions();
    }

    @PostMapping("/v1")
    @Transactional
    public void save(@RequestBody @Valid RegiaoDTO regiaoDTO) {
        regiaoService.saveRegion(regiaoDTO);
    }
}