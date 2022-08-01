package program;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setTitulo("Curso Java POO");
		curso.setDescricao("Descrição curso Java");
		curso.setCargaHorario(6);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Spring Framework Experience");
		bootcamp.setDescricao("Descrição Bootcamp Spring Framework Experience ");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMateus = new Dev();
		devMateus.setNome("Mateus Rodrigues");
		devMateus.inscrever(bootcamp);
		System.out.println(devMateus.getConteudosInscritos());
		devMateus.progredir();
		System.out.println(devMateus.getConteudosConcluidos());
		System.out.println(devMateus.calcularTotalXp());
		

	}

}
