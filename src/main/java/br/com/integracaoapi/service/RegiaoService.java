package br.com.integracaoapi.service;

import br.com.integracaoapi.model.dto.RegiaoDTO;
import br.com.integracaoapi.model.entity.Regiao;
import br.com.integracaoapi.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RegiaoService {

    @Autowired
    private RegiaoRepository regiaoRepository;

    public List<RegiaoDTO> findAll() {
        return regiaoRepository.findAll().stream().map(RegiaoDTO::new).toList();
    }

    public RegiaoDTO saveRegion(RegiaoDTO regiaoDTO) {
        return new RegiaoDTO(regiaoRepository.save(regiaoDTO.toEntity()));
    }

    public RegiaoDTO updateRegion(Integer id, RegiaoDTO regiaoDTO) {
        Regiao findRegion = regiaoRepository.getReferenceById(id);

        findRegion.setDescricao(regiaoDTO.getDescricao());

        return new RegiaoDTO(regiaoRepository.save(findRegion));
    }
}