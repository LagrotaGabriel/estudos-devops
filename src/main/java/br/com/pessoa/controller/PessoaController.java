package br.com.pessoa.controller;

import br.com.pessoa.models.dto.PessoaRequest;
import br.com.pessoa.models.entity.PessoaEntity;
import br.com.pessoa.service.PessoaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PessoaController {

    Logger logger = LoggerFactory.getLogger(PessoaController.class);

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<PessoaEntity> criaNovo(@RequestBody PessoaRequest pessoaRequest) {
        logger.info("Endpoint de criação de nova pessoa acessado");
        return ResponseEntity.ok().body(pessoaService.criaNovo(pessoaRequest));
    }

    @GetMapping
    public ResponseEntity<List<PessoaEntity>> obtemTodos() {
        logger.info("Endpoint de obtenção de todas as pessoas acessado");
        return ResponseEntity.ok().body(pessoaService.obtemTodos());
    }
}