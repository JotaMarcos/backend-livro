package com.masterbare.backendlivro.controller;

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
import com.masterbare.backendlivro.model.Livro;
import com.masterbare.backendlivro.services.LivroService;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> obterTodos() {
        return livroService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Livro> obterPorId(@PathVariable Long id) {
        return livroService.obterPorId(id);
    }

    @PostMapping
    public Livro adicionar(@RequestBody Livro livro) {
        return livroService.adicionar(livro);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        livroService.deletar(id);
        return "Livro com id:" + id + " foi deletado com sucesso!";
    }
    
    @PutMapping("/{id}")
    public Livro atualizar(@RequestBody Livro livro, @PathVariable long id) {

        return livroService.atualizar(id, livro);
    }
}
