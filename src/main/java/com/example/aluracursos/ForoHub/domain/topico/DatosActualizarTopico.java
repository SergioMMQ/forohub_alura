package com.example.aluracursos.ForoHub.domain.topico;

import com.example.aluracursos.ForoHub.domain.curso.NombreCurso;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull Long id,
        String mensaje,
        String titulo,
        NombreCurso nombreCurso
) {
}
