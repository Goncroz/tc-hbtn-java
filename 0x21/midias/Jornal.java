

public class Jornal extends Midia{
	
	private int quantidadeeArtigos;

	public Jornal(String nome, int quantidadeeArtigos) {
		super(nome);
		this.quantidadeeArtigos = quantidadeeArtigos;
	}
	

	public Jornal(String nome) {
		super(nome);
	}


	public int getQuantidadeeArtigos() {
		return quantidadeeArtigos;
	}

	public void setQuantidadeeArtigos(int quantidadeeArtigos) {
		this.quantidadeeArtigos = quantidadeeArtigos;
	}
}
