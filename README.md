## **Sistema de Cadastro de Alunos — Spring Boot**

Projeto de estudos desenvolvido em Java com Spring Boot, utilizando Spring MVC e Thymeleaf para criar uma aplicação web de cadastro e visualização de alunos.

## 📌 O que o projeto faz

O sistema permite cadastrar e visualizar alunos através de uma aplicação web.

Os dados são armazenados temporariamente em memória utilizando uma `List<Aluno>`.

## 🛠️ Tecnologias usadas

Java • Spring Boot • Spring MVC • Thymeleaf • HTML • CSS • Maven • Lombok

## 📋 Funcionalidades

* Listar alunos cadastrados
* Cadastrar novos alunos
* Informar nome, idade e curso
* Exibir os alunos em uma tabela
* Utilizar formulários HTML integrados ao backend

## 🌐 Rotas

| **Rota**       | **Método** | **Função**         |
| -------------- | ---------- | ------------------ |
| `/alunos`      | GET        | Lista os alunos    |
| `/alunos/novo` | GET        | Exibe o formulário |
| `/alunos`      | POST       | Cadastra um aluno  |

## 📂 Estrutura do projeto

| **Classe/Arquivo**      | **Função**                    |
| ----------------------- | ----------------------------- |
| `ExemploApplication`    | Inicia a aplicação            |
| `AlunoController`       | Controla as rotas e operações |
| `Aluno`                 | Modelo dos alunos             |
| `alunos.html`           | Exibe a lista                 |
| `formulario-aluno.html` | Formulário de cadastro        |
| `stylo.css`             | Estilização                   |
| `pom.xml`               | Dependências Maven            |

## 📚 O que estou praticando

Java • Spring Boot • Spring MVC • HTTP • Controllers • GET e POST • Thymeleaf • Formulários web • HTML/CSS • Maven • Estrutura de aplicações web
