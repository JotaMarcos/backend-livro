package com.masterbare.backendlivro.model;
public class Livro {
    
    //#region Atributos
    private Long id;

    private String nomeLivro;

    private Long quantidadePaginas;

    private Long quantidadeCapitulos;

    private String isbn;
    
    private Double valor;
    
    private String nomeEditora;
    
    private String autor;
    
    public Long getId() {
        return id;
    }
    //Sendregion

    //#region Getters and Setters
    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Long getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(Long quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public Long getQuantidadeCapitulos() {
        return quantidadeCapitulos;
    }

    public void setQuantidadeCapitulos(Long quantidadeCapitulos) {
        this.quantidadeCapitulos = quantidadeCapitulos;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }   
    
    //Sendregion

}
