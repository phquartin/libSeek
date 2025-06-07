package com.libseek.controller;

import com.libseek.dto.SearchResultDTO;
import com.libseek.service.OpenLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST que expõe os endpoints relacionados a livros.
 * @RestController combina @Controller e @ResponseBody, simplificando a criação de APIs REST.
 * @RequestMapping("/livros") define que todos os endpoints nesta classe começarão com /livros.
 */
@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private OpenLibraryService openLibraryService;

    /**
     * Endpoint para buscar livros por autor.
     * Exemplo de URL: http://localhost:8080/livros/autor/George Orwell
     *
     * @param autor O nome do autor, vindo da URL.
     * @return Uma resposta HTTP contendo os dados dos livros.
     */
    @GetMapping("/autor/{autor}")
    public ResponseEntity<SearchResultDTO> buscarPorAutor(@PathVariable String autor) {
        // Chama o nosso serviço para fazer a busca.
        SearchResultDTO resultado = openLibraryService.buscarLivrosPorAutor(autor);

        // Retorna uma resposta HTTP 200 (OK) com o resultado no corpo da resposta.
        return ResponseEntity.ok(resultado);
    }
}
