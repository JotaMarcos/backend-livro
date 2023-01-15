package com.masterbare.primeiroexemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.masterbare.primeiroexemplo.model.Produto;
import com.masterbare.primeiroexemplo.services.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterTodos() {
        return produtoService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterPorId(@PathVariable Long id) {
        return produtoService.obterPorId(id);
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return produtoService.adicionar(produto);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        produtoService.deletar(id);
        return "Produto com id:" + id + " foi deletado com sucesso!";
    }
    
    @PutMapping("/{id}")
    public Produto atualizar(@RequestBody Produto produto, @PathVariable long id) {

        return produtoService.atualizar(id, produto);
    }
}
