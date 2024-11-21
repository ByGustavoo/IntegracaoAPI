package br.com.integracaoapi.infra.security.service;

import br.com.integracaoapi.infra.security.repository.AutenticacaoRepository;
import br.com.integracaoapi.model.dto.AutenticacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AutenticacaoRepository autenticacaoRepository;

    public AutenticacaoDTO saveAuthentication(AutenticacaoDTO autenticacaoDTO) {
        encryptPassword(autenticacaoDTO);

        return new AutenticacaoDTO(autenticacaoRepository.save(autenticacaoDTO.toEntity()));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return autenticacaoRepository.findByUsername(username);
    }

    public void encryptPassword(AutenticacaoDTO autenticacaoDTO) {
        autenticacaoDTO.setPassword(passwordEncoder.encode(autenticacaoDTO.getPassword()));
    }
}