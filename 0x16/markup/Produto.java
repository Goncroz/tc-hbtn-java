

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

	private String nome;
	private Double preco;
	private Double percentualMarkup = 0.1;

	Supplier<Double> precoComMarkUp = () -> preco * (1 + percentualMarkup);

	Consumer<Double> atualizarMarkUp = valor -> percentualMarkup = valor / 100;

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

	public Double getPercentualMarkup() {
		return preco * percentualMarkup;
	}

	public void setPercentualMarkup(Double percentualMarkup) {
		this.percentualMarkup = percentualMarkup;
	}

	// Supplier<Double> precoComMarkUp = () -> preco * percentualMarkup;
	// Consumer<Double> atualizarMarkUp = preco -> percentualMarkup = preco / 100;

}
