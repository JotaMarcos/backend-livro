package com.masterbare.backendlivro.repository;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.masterbare.backendlivro.model.Livro;

@Repository
public class LivroRepository {
    
    // Simulando um banco de dados em memória
    private List<Livro> livros = new ArrayList<Livro>();
    private Long ultimoId = 0L;

    /**
     * Método para retornar uma lista de livros
     * @return Lista dos livros
     */
    public List<Livro> obterTodos() {
        return livros;
    }

    /**
     * Método que retorna o livro encontrado pelo seu id.
     * @param id do livro que será localizado. 
     * @return Retorna um livro caso seja encontrado.
     */
    public Optional<Livro> obterPorId(Long id) {
        return livros
                .stream()
                .filter(livro -> livro.getId() == id)
                .findFirst();
    }

    /**
     * Método para adicionar livro na lista.
     * @param livro que será adicionado.
     * @return Retorna o livro que foi adicionado na lista.
     */
    public Livro adicionar(Livro livro) {
       
        ultimoId++;

        livro.setId(ultimoId);
        livros.add(livro);

        return livro;
    }

    /**
     * Método para deletar o livro por id.
     * @param id do livro a ser deletado.
     */
    public void deletar(Long id) {
        livros.removeIf(livro -> livro.getId() == id);
    }

    /**
     * Método para atualizar o livro na lista.
     * @param livro que será atualizado.
     * @return Retorna o livro após atualizar a lista.
     */
    public Livro atualizar(Livro livro) {
        // Encontrar o produto na lista
        Optional<Livro> livroEncontrado = obterPorId(livro.getId());

        if(livroEncontrado.isEmpty()){
            throw new InputMismatchException("Livro não encontrado");
        } 

        // Eu tenho que remover o livro antigo da lista
        deletar(livro.getId());
        // Depois adicionar o livro atualizado na lista.
        livros.add(livro);

        return livro;

    }

}
