package ed;

public class TesteDuplamenteLigada {
	public static void main(String[] args) {
		
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Pedro");
		System.out.println(lista);
		lista.adicionaNoComeco("Tiago");
		System.out.println(lista);
		lista.adicionaNoComeco("Joao");
		System.out.println(lista);
		lista.adiciona(2, "Maria");
		System.out.println(lista);
	}
}
