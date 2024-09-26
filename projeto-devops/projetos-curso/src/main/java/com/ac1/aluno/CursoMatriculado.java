package com.ac1.aluno;

import com.ac1.curso.Curso;

enum StatusCurso
{
	CURSANDO,
	CONCLUÍDO,
	REPROVADO
}

public class CursoMatriculado {
	public Curso curso;
	public StatusCurso status;
	public float nota;
	
	public CursoMatriculado(Curso curso) {
		this.curso = curso;
		this.status = StatusCurso.CURSANDO;
		this.nota = 0;
	}
}
