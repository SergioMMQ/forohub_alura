package com.example.aluracursos.ForoHub.domain.topico;

import com.example.aluracursos.ForoHub.domain.curso.NombreCurso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(

        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor,
        @NotNull NombreCurso nombreCurso)
{
}
