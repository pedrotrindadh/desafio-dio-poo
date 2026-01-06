import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descrição: curso de java");
		curso1.setCargaHoraria(3);
		
		System.out.println(curso1);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição: Mentoria de java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1);
	}
}
