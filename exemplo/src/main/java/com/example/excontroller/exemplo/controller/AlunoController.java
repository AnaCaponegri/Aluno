package com.example.excontroller.exemplo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.excontroller.exemplo.model.Aluno;

@Controller
public class AlunoController {
    // Lista que funcionará como nosso armazenamento temporário.
    //
    // Por enquanto não temos banco de dados.
    private List<Aluno> alunos = new ArrayList<>();
    // Construtor do Controller
    //
    // Adicionamos alguns alunos inicialmente
    // somente para nossa aplicação não começar vazia.
    public AlunoController() {
        alunos.add(
            new Aluno(
                "João",
                17,
                "Desenvolvimento de Sistemas"
            )
        );

        alunos.add(
            new Aluno(
                "Maria",
                16,
                "Desenvolvimento de Sistemas"
            )
        );

        alunos.add(
            new Aluno(
                "Pedro",
                18,
                "Redes de Computadores"
            )
        );
    }
    // ------------------------------------------------
    // LISTAR ALUNOS
    // ------------------------------------------------
    // Quando acessar:
    //
    // http://localhost:8080/alunos
    @GetMapping("/alunos")
    public String listarAlunos(Model model) {
        // Envia a lista para o HTML
        model.addAttribute("alunos", alunos);
        // Abre:
        // templates/alunos.html
        return "alunos";
    }
    // ------------------------------------------------
    // ABRIR FORMULÁRIO
    // ------------------------------------------------
    // Quando acessar:
    //
    // http://localhost:8080/alunos/novo
    @GetMapping("/alunos/novo")
    public String abrirFormulario(Model model) {
        // Criamos um aluno vazio
        //
        // O formulário utilizará esse objeto
        // para preencher nome, idade e curso.
        model.addAttribute(
            "aluno",
            new Aluno()
        );
        // Abre:
        // templates/formulario-aluno.html
        return "formulario-aluno";
    }
    // ------------------------------------------------
    // CADASTRAR ALUNO
    // ------------------------------------------------
    // Este endereço será chamado pelo formulário
    // utilizando uma requisição POST.
    @PostMapping("/alunos")
    public String cadastrarAluno(
            @ModelAttribute Aluno aluno) {
        // O Spring já criou e preencheu
        // o objeto aluno automaticamente.

        // Adicionamos o aluno na lista.
        alunos.add(aluno);

        // Depois do cadastro,
        // redirecionamos para /alunos.
        return "redirect:/alunos";
    }
}

