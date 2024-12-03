package br.com.integracaoapi.infra.security.controller;

import br.com.integracaoapi.infra.security.model.response.AuthenticationResponseDTO;
import br.com.integracaoapi.infra.security.model.response.TokenResponseDTO;
import br.com.integracaoapi.infra.security.service.AutenticacaoService;
import br.com.integracaoapi.infra.security.model.dto.AutenticacaoDTO;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Tag(name = "Autenticação")
public class AutenticacaoController {

    @Autowired
    private AutenticacaoService autenticacaoService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/save")
    @Transactional
    public ResponseEntity<AuthenticationResponseDTO> signUp(@RequestBody @Valid AutenticacaoDTO autenticacaoDTO) {
        return ResponseEntity.ok(autenticacaoService.saveAuthentication(autenticacaoDTO));
    }

    @PostMapping
    @SecurityRequirement(name = "Authorization")
    public ResponseEntity<TokenResponseDTO> signIn(@RequestBody @Valid AutenticacaoDTO autenticacaoDTO) {
        var authentication = authenticationManager.authenticate(autenticacaoDTO.convertAuthentication());
        return ResponseEntity.ok(autenticacaoService.generateTokenForAuthentication(authentication));
    }
}