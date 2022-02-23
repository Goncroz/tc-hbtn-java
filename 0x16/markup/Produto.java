
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
	
	private String nome;
	private double preco;
	private double percentualMarkup = 0.1;

	
	
	public Produto(double preco, String nome) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {
	}

	Supplier<Double> precoComMarkUp = () -> preco * (1 + percentualMarkup);
	
	Consumer<Double> atualizarMarkUp = precoD -> percentualMarkup = precoD / 100;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPercentualMarkup() {
		return preco * percentualMarkup;
	}

	public void setPercentualMarkup(double percentualMarkup) {
		this.percentualMarkup = percentualMarkup;
	}
	
	//Supplier<Double> precoComMarkUp = () -> preco * percentualMarkup;
	//Consumer<Double> atualizarMarkUp = preco -> percentualMarkup = preco / 100;

	

}
