# LibSeek 📚

LibSeek é uma aplicação back-end desenvolvida com Spring Boot que serve como uma plataforma para busca de informações sobre livros. A aplicação consome a API pública da [Open Library](https://openlibrary.org/developers/api) para buscar livros por autor e está configurada para se conectar a um banco de dados MySQL gerenciado via Docker.

---

## ✨ Features

* **Busca de Livros:** API REST para buscar livros por nome do autor.
* **Integração Externa:** Comunicação em tempo real com a API da Open Library.
* **Ambiente Dockerizado:** Banco de dados MySQL configurado e gerenciado com Docker Compose, garantindo um ambiente de desenvolvimento fácil e replicável.
* **Persistência de Dados (Pronta para uso):** Estrutura com Spring Data JPA pronta para salvar e gerenciar dados de livros, autores, etc.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Maven**
* **Spring Web:** Para a criação dos controladores REST.
* **Spring Data JPA:** Para a persistência de dados (opcional, mas configurado).
* **MySQL:** Banco de dados relacional.
* **Docker & Docker Compose:** Para gerenciar o contêiner do banco de dados.

---

## ⚙️ Pré-requisitos

Antes de começar, garanta que você tem as seguintes ferramentas instaladas em sua máquina:
* [JDK](https://www.oracle.com/java/technologies/downloads/) (versão 17 ou superior)
* [Maven](https://maven.apache.org/download.cgi)
* [Docker](https://www.docker.com/products/docker-desktop/)
* [Git](https://git-scm.com/)

---

## 📖 Uso da API

A API possui o seguinte endpoint para busca de livros:

### Buscar livros por autor

* **Endpoint:** `GET /livros/autor/{nomeDoAutor}`
* **Descrição:** Retorna uma lista de livros encontrados para o autor especificado.
* **Exemplo com cURL:**

```bash
curl -X GET http://localhost:8080/livros/autor/"J.K. Rowling"
```

* **Exemplo de Resposta:**

```json
{
  "docs": [
    {
      "titulo": "Harry Potter and the Sorcerer's Stone",
      "autores": [
        "J.K. Rowling"
      ],
      "anoPublicacao": 1997
    },
    {
      "titulo": "Harry Potter and the Chamber of Secrets",
      "autores": [
        "J.K. Rowling"
      ],
      "anoPublicacao": 1998
    }
  ]
}
```

---

## 🏗️ Estrutura do Projeto

```
.
├── src
│   └── main
│       ├── java/com/exemplo/buscadorlivros
│       │   ├── controller  # Controladores REST (endpoints)
│       │   ├── dto         # Objetos de Transferência de Dados (APIs externas)
│       │   ├── model       # Entidades do banco de dados (@Entity)
│       │   ├── repository  # Interfaces do Spring Data JPA
│       │   └── service     # Lógica de negócio
│       └── resources
│           └── application.properties
├── compose.yaml            # Configuração do Docker
└── pom.xml                 # Dependências do Maven
```

---

## 👨‍💻 Autor

Feito com ❤️ por **Pedro Quartin**.

---

## 📜 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.