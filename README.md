# 📚 API de Alunos – Spring Boot

API REST desenvolvida em **Java com Spring Boot**, com foco em boas práticas de arquitetura, validação de dados e tratamento de exceções.  
Projeto criado com objetivo de **aprendizado prático** e **composição de portfólio**.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Bean Validation (Jakarta Validation)
- PostgreSQL
- Swagger / OpenAPI (SpringDoc)
- Maven

---

## 🏗️ Arquitetura do Projeto

O projeto segue uma separação clara de responsabilidades:

Controller -> Service -> Repository -> Database

### 📂 Pacotes principais

- `controller` → Camada de entrada (API REST)
- `service` → Regras de negócio
- `repository` → Comunicação com o banco de dados
- `model` → Entidades JPA
- `dto` → Objetos de transferência de dados
- `exception` → Tratamento global de erros

---

## 📌 Funcionalidades

✔️ Cadastrar aluno  
✔️ Listar todos os alunos  
✔️ Buscar aluno por ID  
✔️ Atualizar aluno  
✔️ Deletar aluno  
✔️ Validação de dados (nome e curso obrigatórios)  
✔️ Tratamento de erros personalizado  
✔️ Documentação automática com Swagger  

---

## 🔎 Validações Implementadas

- Nome do aluno obrigatório
- Nome com no mínimo 3 caracteres
- Curso obrigatório
- Retorno de erros claros e padronizados (`400 Bad Request`)

Exemplo de erro:
```json
{
  "status": 400,
  "erros": {
    "nome": "O nome do aluno é obrigatório"
  }
}
```

## 📄 Documentação da API (Swagger)

Após rodar o projeto, acesse:

http://localhost:8080/swagger-ui.html

## ⚙️ Como Executar o Projeto

Pré-requisitos:

- Java 17
- PostgreSQL
- Maven

Passos:

- git clone https://github.com/seu-usuario/api-alunos-springboot.git
- cd api-alunos-springboot
- mvn spring-boot:run

## 🧠 Aprendizados

Este projeto permitiu praticar:

- Criação de APIs REST com Spring Boot
- Arquitetura em camadas
- DTOs e validações
- Tratamento global de exceções
- Integração com banco de dados
- Documentação com Swagger
- Versionamento com Git e GitHub

## 👤 Autor

Filipe Freitas
Estudante de Ciência da Computação
Apaixonado por desenvolvimento e programação ☕🚀
