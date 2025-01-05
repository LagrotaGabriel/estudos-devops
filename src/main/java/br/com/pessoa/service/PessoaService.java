package br.com.pessoa.service;

import br.com.pessoa.models.dto.PessoaRequest;
import br.com.pessoa.models.entity.PessoaEntity;

import java.util.List;

public interface PessoaService {

    PessoaEntity criaNovo(PessoaRequest pessoaRequest);

    List<PessoaEntity> obtemTodos();
}
