package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.RegiaoDTO;
import br.com.integracaoapi.service.RegiaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
    public void saveRegion(@RequestBody @Valid RegiaoDTO regiaoDTO) {
        regiaoService.saveRegion(regiaoDTO);
    }

    @PatchMapping("/v1/{id}")
    @Transactional
    public void updateRegion(@PathVariable Integer id, @RequestBody @Valid RegiaoDTO regiaoDTO) {
        regiaoService.updateRegion(id, regiaoDTO);
    }
}