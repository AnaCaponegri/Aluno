package com.example.excontroller.exemplo.model;

public class Aluno {

    private String nome;
    private int idade;
    private String curso;


    // Construtor vazio
    // Importante para o Spring conseguir criar
    // o objeto a partir dos dados do formulário
    public Aluno() {

    }


    // Construtor com os atributos
    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }


    // GETTERS

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }


    // SETTERS
    // Permitem que o Spring coloque os dados
    // recebidos do formulário no objeto

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

