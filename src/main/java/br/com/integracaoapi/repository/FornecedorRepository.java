package br.com.integracaoapi.repository;

import br.com.integracaoapi.model.entity.Fornecedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

    Page<Fornecedor> findAllBySituacaoCadastroDescricao(String descricao, Pageable pageable);

}