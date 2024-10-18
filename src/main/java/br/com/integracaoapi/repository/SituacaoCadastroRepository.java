package br.com.integracaoapi.repository;

import br.com.integracaoapi.model.entity.SituacaoCadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituacaoCadastroRepository extends JpaRepository<SituacaoCadastro, Integer> {

}