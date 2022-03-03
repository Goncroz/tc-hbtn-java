

public class Midia {
	
	private String nome;

	public Midia(String nome) {
		super();
		this.nome = nome;
	}
	

	public Midia() {
		super();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome());
	}
}
