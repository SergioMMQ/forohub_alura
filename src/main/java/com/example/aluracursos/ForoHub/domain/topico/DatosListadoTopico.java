package com.example.aluracursos.ForoHub.domain.topico;

import com.example.aluracursos.ForoHub.domain.curso.NombreCurso;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        Boolean estadoActivo,
        String fechaCreacion,
        String autor,
        NombreCurso nombreCurso
) {

    public DatosListadoTopico(Topico topico) {

        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.isEstadoDeActividad(), topico.getFechaDeCreacion()
                , topico.getAutor(), topico.getNombreCurso());

    }
}