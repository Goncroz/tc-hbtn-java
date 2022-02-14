import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nomeDoCliente;
	List<Double> transacoes = new ArrayList<>();
	
	public Cliente(String nome, double transacoes) {
		super();
		this.nomeDoCliente = nome;
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
		return nomeDoCliente;
	}
}
