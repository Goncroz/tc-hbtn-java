
public class Livro extends Midia{
	
	private int edicao;

	public Livro(String nome, int edicao) {
		super(nome);
		this.edicao = edicao;
	}
	

	public Livro(String nome) {
		super(nome);
	}


	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
}
