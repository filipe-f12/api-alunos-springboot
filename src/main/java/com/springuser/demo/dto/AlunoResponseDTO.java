package com.springuser.demo.dto;

public class AlunoResponseDTO {
    private Long id;
    private String nome;
    private String curso;

    public AlunoResponseDTO(Long id, String nome, String curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}
