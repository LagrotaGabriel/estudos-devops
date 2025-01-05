package br.com.pessoa.service.impl;

import br.com.pessoa.models.dto.PessoaRequest;
import br.com.pessoa.models.entity.PessoaEntity;
import br.com.pessoa.service.PessoaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Override
    public PessoaEntity criaNovo(PessoaRequest pessoaRequest) {
        return null;
    }

    @Override
    public List<PessoaEntity> obtemTodos() {
        return List.of();
    }
}
