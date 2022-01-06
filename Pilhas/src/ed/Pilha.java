package ed;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	//PUSH
	public void insere(String nome) {
		nomes.add(nome);
	}
	
	//REMOVE
	public String remove() {
	    return nomes.remove(nomes.size()-1);	
	}
	
	public boolean vazia() {
		//return nomes.size() == 0;
		return nomes.isEmpty();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nomes.toString();
	}
}
