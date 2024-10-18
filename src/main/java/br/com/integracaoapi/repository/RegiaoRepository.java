package br.com.integracaoapi.repository;

import br.com.integracaoapi.model.entity.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Integer> {

}