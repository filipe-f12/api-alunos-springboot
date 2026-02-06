package com.springuser.demo.controller;

import com.springuser.demo.dto.AlunoRequestDTO;
import com.springuser.demo.dto.AlunoResponseDTO;
import com.springuser.demo.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<AlunoResponseDTO> listar() {
        return alunoService.listarTodos();
    }

    @GetMapping("/{id}")
    public AlunoResponseDTO buscar(@PathVariable Long id) {
       return alunoService.buscarPorId(id);
    }

    @PostMapping
    public AlunoResponseDTO criar(@Valid @RequestBody AlunoRequestDTO dto) {
        return alunoService.salvar(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }

    @PutMapping("/{id}")
    public AlunoResponseDTO atualizar(@PathVariable Long id, @Valid @RequestBody AlunoRequestDTO dto) {
        return alunoService.atualizar(id, dto);
    }
}
