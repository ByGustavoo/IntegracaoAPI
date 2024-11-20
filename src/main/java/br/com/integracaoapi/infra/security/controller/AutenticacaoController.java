package br.com.integracaoapi.infra.security.controller;

import br.com.integracaoapi.model.dto.AutenticacaoDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity<AutenticacaoDTO> executeAuthentication(@RequestBody @Valid AutenticacaoDTO autenticacaoDTO) {
        authenticationManager.authenticate(autenticacaoDTO.convertAuthentication());
        return ResponseEntity.ok().build();
    }
}