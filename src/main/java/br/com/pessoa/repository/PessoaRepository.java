package br.com.pessoa.repository;

import br.com.pessoa.models.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, UUID> {
}
