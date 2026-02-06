package com.springuser.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AlunoRequestDTO {
    @NotBlank(message = "O nome do aluno é obrigatório")
    @Size(min = 3, message = "O nome deve possuir no mínimo 3 caracteres")
    private String nome;

    @NotBlank(message = "O curso do aluno é obrigatório")
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
