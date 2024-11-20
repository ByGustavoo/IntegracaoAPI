package br.com.integracaoapi.infra.security.repository;

import br.com.integracaoapi.model.entity.Autenticacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface AutenticacaoRepository extends JpaRepository<Autenticacao, Integer> {

    UserDetails findByUsername(String username);
}