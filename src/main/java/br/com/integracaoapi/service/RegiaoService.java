package br.com.integracaoapi.service;

import br.com.integracaoapi.exceptions.NotFoundException;
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

    public List<RegiaoDTO> getAllRegions() {
        return regiaoRepository.findAll().stream().map(RegiaoDTO::new).toList();
    }

    public void saveRegion(RegiaoDTO regiaoDTO) {
        regiaoRepository.save(regiaoDTO.toEntity());
    }

    public void updateRegion(Integer id, RegiaoDTO regiaoDTO) {
        try {
            Regiao findRegion = regiaoRepository.findById(id)
                    .orElseThrow(() -> new NotFoundException("ERRO! A Região não foi encontrada!"));

            findRegion.setDescricao(regiaoDTO.getDescricao());

            regiaoRepository.save(findRegion);
        }
        catch (RuntimeException ex) {
            throw new NotFoundException("ERRO! Não foi possível atualizar!", ex);
        }
    }
}