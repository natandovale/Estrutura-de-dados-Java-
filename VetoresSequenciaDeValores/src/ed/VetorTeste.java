package ed;

import java.util.ArrayList;

public class VetorTeste {
	public static void main(String[] args) {
		
		 Aluno a1 = new Aluno("Joao");
		 Aluno a2 = new Aluno("Paulo");
		 Aluno a3 = new Aluno("Maria");
		 Aluno a4 = new Aluno("Jose");
		 
		 Vetor lista = new Vetor();
		 lista.adiciona(a1);
		 lista.adiciona(a2);
		 lista.adiciona(a3);
		 lista.adiciona(1, a4);
		 
		 System.out.println(lista);
		 
		 //Aluno x = lista.pega(158);
		 //System.out.println(x);
		 
		 ArrayList<Aluno> listaDoJava = new ArrayList<Aluno>();
	}
}
