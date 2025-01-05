package br.com.pessoa.service.impl;

import br.com.pessoa.models.dto.PessoaRequest;
import br.com.pessoa.models.entity.PessoaEntity;
import br.com.pessoa.repository.PessoaRepository;
import br.com.pessoa.service.PessoaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public PessoaEntity criaNovo(PessoaRequest pessoaRequest) {

        PessoaEntity pessoaEntity = new PessoaEntity(pessoaRequest.nome(), pessoaRequest.idade());

        return pessoaRepository.save(pessoaEntity);
    }

    @Override
    public List<PessoaEntity> obtemTodos() {
        return pessoaRepository.findAll();
    }
}
