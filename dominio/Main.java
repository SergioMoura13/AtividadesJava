package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		Curso curso1 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso.setTitulo("Engenharia de Software");
		curso.setDescricao("Curso voltado para programacao");
		curso.setCargaHoraria(50);
		
		curso1.setTitulo("Ciencia da computacao");
		curso1.setDescricao("Curso voltado para programacao");
		curso1.setCargaHoraria(45);
		
		mentoria.setTitulo("Mentoria dos cursos");
		mentoria.setDescricao("Curso voltado a mentoria pessoal");
		mentoria.setData(LocalDate.now());
		
		
	
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Java");
		bootcamp.setDescricao("Descricao do bootcamp");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devSergio = new Dev();
		devSergio.setNome("Sergio");
		devSergio.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + devSergio.getConteudosInscritos());
		devSergio.progredir();
		devSergio.progredir();
		System.out.println("Conteudos Concluidos: " + devSergio.getConteudosConcluidos()); 
		System.out.println("XP: " + devSergio.calcularXp());
		
		

	}

}
