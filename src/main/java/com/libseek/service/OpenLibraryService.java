package com.libseek.service;

import com.libseek.dto.SearchResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Serviço responsável pela lógica de negócio e comunicação com a API da Open Library.
 * A anotação @Service marca esta classe como um componente de serviço do Spring,
 * o que nos permite injetá-la em outras classes, como o Controller.
 */
@Service
public class OpenLibraryService {

    // URL base da API de busca da Open Library.
    private static final String OPEN_LIBRARY_API_URL = "https://openlibrary.org/search.json";

    /**
     * Busca livros de um determinado autor na API da Open Library.
     *
     * @param autor O nome do autor a ser pesquisado.
     * @return Um objeto SearchResultDTO contendo a lista de livros encontrados.
     */
    public SearchResultDTO buscarLivrosPorAutor(String autor) {
        // RestTemplate é a ferramenta do Spring para fazer requisições a APIs externas.
        RestTemplate restTemplate = new RestTemplate();

        // UriComponentsBuilder nos ajuda a construir a URL da requisição de forma segura,
        // tratando espaços e caracteres especiais no nome do autor.
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(OPEN_LIBRARY_API_URL)
                .queryParam("author", autor); // Adiciona o parâmetro de busca ?author=nome_do_autor

        // Faz a requisição GET para a URL construída e espera uma resposta
        // que possa ser convertida para a nossa classe SearchResultDTO.
        return restTemplate.getForObject(builder.toUriString(), SearchResultDTO.class);
    }
}