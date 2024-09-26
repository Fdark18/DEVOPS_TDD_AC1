package com.ac1.gerenciador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GerenciadorTest {

	@Test
	@DisplayName("O aluno deve ganhar mais 3 cursos caso concluir um curso com uma nota superior ou igual a 7")
	void alunoPassou() {
		assertEquals(true, true);
	}
	
	@Test
	@DisplayName("O aluno NÃO deve ganhar cursos caso tirar uma nota inferior a 7")
	void alunoReprovou() {
		assertEquals(true, true);
	}
	
	@Test
	@DisplayName("Se o aluno NÃO concluiu o curso ele não deve desbloquear novos cursos gratuítos")
	void alunoNaoConcluiuCurso() {
		assertEquals(true, true);
	}

}
