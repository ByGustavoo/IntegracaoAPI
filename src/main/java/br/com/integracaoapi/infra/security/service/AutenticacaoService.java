package br.com.integracaoapi.infra.security.service;

import br.com.integracaoapi.infra.security.dto.AuthenticationResponseDTO;
import br.com.integracaoapi.infra.security.dto.TokenResponseDTO;
import br.com.integracaoapi.infra.security.repository.AutenticacaoRepository;
import br.com.integracaoapi.model.dto.AutenticacaoDTO;
import br.com.integracaoapi.model.entity.Autenticacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AutenticacaoRepository autenticacaoRepository;

    public AuthenticationResponseDTO saveAuthentication(AutenticacaoDTO autenticacaoDTO) {
        validateAuthentication(autenticacaoDTO);
        autenticacaoRepository.save(autenticacaoDTO.toEntity());
        return AuthenticationResponseDTO.authenticationResponseDTO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return autenticacaoRepository.findByUsername(username);
    }

    public TokenResponseDTO generateTokenForAuthentication(Authentication authentication) {
        String token = convertAuthenticationToToken(authentication);
        return new TokenResponseDTO(token);
    }

    private void validateAuthentication(AutenticacaoDTO autenticacaoDTO) {
        checkUsername(autenticacaoDTO.getUsername());
        encryptPassword(autenticacaoDTO);
    }

    private void encryptPassword(AutenticacaoDTO autenticacaoDTO) {
        autenticacaoDTO.setPassword(passwordEncoder.encode(autenticacaoDTO.getPassword()));
    }

    private void checkUsername(String username) {
        var findUser = autenticacaoRepository.findByUsername(username);

        if (findUser != null) {
            throw new RuntimeException("ERRO! Esse usuário já está cadastrado!");
        }
    }

    private String convertAuthenticationToToken(Authentication authentication) {
        var authenticationToEntity = (Autenticacao) authentication.getPrincipal();
        var entityToDTO = new AutenticacaoDTO(authenticationToEntity);
        return tokenService.generateToken(entityToDTO);
    }
}