

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

	String nome;
	Double preco;
	Double percentualMarkUp = 0.1;

	Supplier<Double> precoComMarkUp = () -> preco * (1 + percentualMarkUp);

	Consumer<Double> atualizarMarkUp = valor -> percentualMarkUp = valor / 100;

	public Produto(Double preco, String nome) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getPercentualMarkUp() {
		return preco * percentualMarkUp;
	}

	public void setPercentualMarkup(Double percentualMarkUp) {
		this.percentualMarkUp = percentualMarkUp;
	}

	// Supplier<Double> precoComMarkUp = () -> preco * percentualMarkup;
	// Consumer<Double> atualizarMarkUp = preco -> percentualMarkup = preco / 100;

}
