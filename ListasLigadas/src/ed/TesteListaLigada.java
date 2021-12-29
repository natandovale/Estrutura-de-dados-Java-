package ed;

public class TesteListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Pedro");
		System.out.println(lista);
		lista.adicionaNoComeco("Tiago");
		System.out.println(lista);
		lista.adicionaNoComeco("Joao");
		System.out.println(lista);
	}

}
