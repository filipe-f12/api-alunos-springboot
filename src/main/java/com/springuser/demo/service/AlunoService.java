package com.springuser.demo.service;

import com.springuser.demo.exception.AlunoNotFoundException;
import com.springuser.demo.model.Aluno;
import com.springuser.demo.repository.AlunoRepository;
import com.springuser.demo.dto.AlunoResponseDTO;
import com.springuser.demo.dto.AlunoRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<AlunoResponseDTO> listarTodos() {
        return alunoRepository.findAll()
                .stream()
                .map(aluno -> new AlunoResponseDTO(
                        aluno.getId(),
                        aluno.getNome(),
                        aluno.getCurso()
                ))
                .toList();
    }

    public AlunoResponseDTO buscarPorId(Long id) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new AlunoNotFoundException(id));

        return new AlunoResponseDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getCurso()
        );
    }

    public AlunoResponseDTO salvar(AlunoRequestDTO dto) {
        Aluno aluno = new Aluno();
        aluno.setNome(dto.getNome());
        aluno.setCurso(dto.getCurso());

        Aluno salvo = alunoRepository.save(aluno);

        return new AlunoResponseDTO(
                salvo.getId(),
                salvo.getNome(),
                salvo.getCurso()
        );
    }

    public AlunoResponseDTO atualizar(Long id, AlunoRequestDTO dto) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new AlunoNotFoundException(id));

        aluno.setNome(dto.getNome());
        aluno.setCurso(dto.getCurso());

        Aluno atualizado = alunoRepository.save(aluno);

        return new AlunoResponseDTO(
                atualizado.getId(),
                atualizado.getNome(),
                atualizado.getCurso()
        );
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }
}
