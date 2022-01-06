package ed;

import java.util.Stack;

public class TestePilha {
	public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        pilha.insere("Mauricio");
        System.out.println(pilha);

        pilha.insere("Guilherme");
        System.out.println(pilha);
        
        Stack<String> stack = new Stack<String>();
        stack.push("Mauricio");
        stack.push("Marcelo");

        String nome = stack.peek();
        System.out.println(nome);
        
        stack.pop();
        System.out.println(stack);
    }
}
