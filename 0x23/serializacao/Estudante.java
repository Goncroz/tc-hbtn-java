

import java.io.Serializable;

public class Estudante implements Serializable{
	 
	private int idade;
	private String nome;
	transient private String senha;
	
	public Estudante(int idade, String nome, String senha) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.senha = senha;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Estudante { nome='" + nome + "', idade='" + idade + "', senha='" + senha + "' }";
	}
	
	
}