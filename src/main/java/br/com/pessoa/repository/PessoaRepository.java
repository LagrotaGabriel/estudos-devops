package br.com.pessoa.repository;

import br.com.pessoa.models.entity.PessoaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends MongoRepository<PessoaEntity, String> {
}
