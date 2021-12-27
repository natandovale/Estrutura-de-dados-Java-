package ed;

public class Aluno {
	
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
}
