package br.com.integracaoapi.repository;

import br.com.integracaoapi.model.entity.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Integer> {

}