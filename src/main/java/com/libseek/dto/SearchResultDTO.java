package com.libseek.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Representa o objeto principal da resposta da API de busca.
 * Ele contém a lista de documentos (livros).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResultDTO {

    // Mapeia a lista "docs" do JSON para a nossa lista de DocsDTO
    @JsonProperty("docs")
    private List<DocsDTO> docs;

    // Getter e Setter
    public List<DocsDTO> getDocs() {
        return docs;
    }

    public void setDocs(List<DocsDTO> docs) {
        this.docs = docs;
    }
}
