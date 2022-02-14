import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	List<Double> transacoes = new ArrayList<>();
	
	public Cliente(String nome, double transacoes) {
		super();
		this.nome = nome;
		this.transacoes = new ArrayList<>();
	}

	public Cliente() {
	}

	public List<Double> getTransacoes() {
		return transacoes;
	}
	
	public void adicionarTransacao(double valorDaTransacao) {
		transacoes.add(valorDaTransacao);
	}

	public String getNomeDoCliente() {
		return nome;
	}
}
