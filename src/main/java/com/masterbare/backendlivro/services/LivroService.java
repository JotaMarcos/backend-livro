package com.masterbare.backendlivro.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masterbare.backendlivro.model.Livro;
import com.masterbare.backendlivro.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    
    /**
     * Método para retornar uma lista de livros
     * @return Lista dos livros
     */
    public List<Livro> obterTodos() {
        // Colocar regra aqui caso tenha ...
        return livroRepository.obterTodos();
    }

    /**
     * Método que retorna o livro encontrado pelo seu id.
     * @param id do livro que será localizado. 
     * @return Retorna um livro caso seja encontrado.
     */
    public Optional<Livro> obterPorId(Long id) {
        return livroRepository.obterPorId(id);
    }

     /**
     * Método para adicionar livro na lista.
     * @param livro que será adicionado.
     * @return Retorna o livro que foi adicionado na lista.
     */
    public Livro adicionar(Livro livro) {
        // Poderia ter alguma regra de negócio para validar o livro.
        return livroRepository.adicionar(livro);
    }

    /**
     * Método para deletar o livro por id.
     * @param id do livro a ser deletado.
     */
    public void deletar(Long id) {
        // Aqui poderia ter alguma lógica de validação.
        livroRepository.deletar(id);
    }

    /**
     * Método para atualizar o livro na lista.
     * @param livro que será atualizado.
     * @param id do livro.
     * @return Retorna o livro após atualizar a lista.
     */
    public Livro atualizar(Long id, Livro livro) {
       
        // Ter alguma validação no ID.
        livro.setId(id);

        return livroRepository.atualizar(livro);
    }

}
