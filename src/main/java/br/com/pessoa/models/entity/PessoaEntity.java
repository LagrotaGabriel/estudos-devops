package br.com.pessoa.models.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("pessoa")
public class PessoaEntity {

    @Id
    private String id;
    private String nome;
    private Integer idade;

    public PessoaEntity(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
