


public class Comida {
	
	private String nome;
	private double calorias;
	private double preco;
	
	public Comida(String nome, double calorias, double preco) {
		super();
		this.nome = nome;
		this.calorias = calorias;
		this.preco = preco;
	}

	public Comida() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "[" + nome + "] " + String.format("%f ", calorias) + String.format("R$ %f", preco);
	}
	
	

}
