import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Curso curso = new Curso();
		 
		 curso.setTitulo("Curso Pyton");
		 curso.setDescricao("Primeiros passos");
		 curso.setCargaHoraria(2);
		 
		 Curso curso2 = new Curso();
		 
		 curso2.setTitulo("Curso Java");
		 curso2.setDescricao("Controladores");
		 curso2.setCargaHoraria(4);
		 
		 Curso curso3 = new Curso();
		 
		 curso3.setTitulo("Curso Laravel");
		 curso3.setDescricao("Conhecendo o framework");
		 curso3.setCargaHoraria(12);
		 
		 Mentoria mentoria = new Mentoria();
		 
		 mentoria.setTitulo("Apresentação do Bootcamp");
		 mentoria.setDescricao("Conhecendo a missão e valores da empresa");
		 mentoria.setData(LocalDate.now());
		 
		 //Poliforfismo
		 Conteudo xpCurso = new Curso();
		 Conteudo xpMentoria = new Mentoria();
		 
		 
		 
		 //Cursos
		 System.out.println(curso +""+ xpCurso.calculaXp());
		 System.out.println(curso2+""+ xpCurso.calculaXp());
		 System.out.println(curso3+""+ xpCurso.calculaXp());
		 //Mentorias
		 System.out.println(mentoria+""+ xpMentoria.calculaXp());
		 
	}


}
