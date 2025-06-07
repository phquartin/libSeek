package com.libseek.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Representa um único livro (documento) retornado pela API da Open Library.
 * A anotação @JsonIgnoreProperties(ignoreUnknown = true) é importante para que o Jackson
 * (biblioteca que o Spring usa para JSON) não dê erro se a API retornar campos
 * que não mapeamos aqui.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocsDTO {

    // Mapeia o campo "title" do JSON para o atributo "titulo"
    @JsonProperty("title")
    private String titulo;

    // Mapeia o campo "author_name" do JSON para o atributo "autores"
    @JsonProperty("author_name")
    private List<String> autores;

    // Mapeia o campo "first_publish_year" para "anoPublicacao"
    @JsonProperty("first_publish_year")
    private int anoPublicacao;

    // Getters e Setters para que o Spring consiga acessar os campos.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
