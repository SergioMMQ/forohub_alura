package com.example.aluracursos.ForoHub.domain.topico;

import com.example.aluracursos.ForoHub.domain.curso.NombreCurso;


public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCrecacion,
        Boolean estadoActivo,
        String autor,
        NombreCurso nombreCurso) {
}