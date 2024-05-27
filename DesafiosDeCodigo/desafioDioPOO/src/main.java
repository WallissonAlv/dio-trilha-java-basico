import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria1 = new Mentoria();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição...");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição...");
		curso2.setCargaHoraria(12);
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição...");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println(mentoria2);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developers 2024");
		bootcamp.setDescricao("Descrição sobre o bootcamp...");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devWallisson = new Dev();
		devWallisson.setNome("Wallisson");
		devWallisson.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Wallisson \n"+ devWallisson.getConteudosInscritos()+"\n");
		devWallisson.progredir();
		System.out.println("Conteúdos Inscritos Wallisson \n"+ devWallisson.getConteudosInscritos()+"\n");
		System.out.println("Conteúdos Concluidos Wallisson \n"+ devWallisson.getConteudosConcluidos()+"\n");
		System.out.println("XP: "+devWallisson.calcularTotalXp()+"\n");
		
		System.out.println("---------------------------------------------------");
		
		Dev devIngred = new Dev();
		devIngred.setNome("Ingred");
		devIngred.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Ingred \n"+ devIngred.getConteudosInscritos()+"\n");
		System.out.println("XP: "+devIngred.calcularTotalXp()+"\n");
		
		
		
	}

}
