package br.com.pessoa.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;


@Entity
@Table(name = "TB_PESSOA")
public class PessoaEntity {

    @Id
    private UUID id;
    private String nome;
    private Integer idade;

    public PessoaEntity(String nome, Integer idade) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaEntity() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
