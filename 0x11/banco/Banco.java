import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	List<Agencia> agencias = new ArrayList<>();

	public Banco(String nome) {
		super();
		this.nome = nome;
		this.agencias = new ArrayList<>();
	}
	public Banco() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Agencia> getAgencias() {
		return agencias;
	}
	
	public Agencia buscarAgencia(String nomeAgencia) {
		for (Agencia agencia : agencias) {
			if (agencia.getNomeAgencia(nomeAgencia).equals(nomeAgencia)) {
				return agencia;
			}
		}
		return null;
	}

	public boolean adicionarAgencia(String nomeDaAgencia) {
		Agencia adicionandoAgencia = buscarAgencia(nomeDaAgencia);
		if (adicionandoAgencia == null) {
			agencias.add(adicionandoAgencia);
			return true;
		}
		Agencia buscandoAgencia = new Agencia(nomeDaAgencia);
		return false;
	}

	public boolean adicionarCliente(String nomeDaAgencia, String nomeDoCliente, double valorDaTransacaoInicial) {
		Agencia adicionandoCliente = buscarAgencia(nomeDaAgencia);
		if (adicionandoCliente == null) {
			return false;
		}

		adicionandoCliente.novoCliente(nomeDoCliente, valorDaTransacaoInicial);
		adicionandoCliente.adicionarTransacaoCliente(nomeDoCliente, valorDaTransacaoInicial);
		return true;

	}

	public boolean adicionarTransacaoCliente(String nomeDaAgencia, String nomeDoCliente, double valorTansacaoInicial) {
		Agencia adicionandoTransacao = buscarAgencia(nomeDaAgencia);
		if (adicionandoTransacao == null) {
			return false;

		}
		adicionandoTransacao.adicionarTransacaoCliente(nomeDoCliente, valorTansacaoInicial);
		return true;
	}

	public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
		Agencia listandoClientes = buscarAgencia(nomeAgencia);

		if (listandoClientes == null) {
			return false;
		}

		for (int i = 0; i < listandoClientes.getClientes().size(); i++) {
			Cliente clienteEncontrado = listandoClientes.getClientes().get(i);
			System.out.println("Cliente: " + clienteEncontrado.getNomeDoCliente() + " [" + (i + 1) + "]");

			if (imprimirTransacoes) {
				for (int j = 0; j < clienteEncontrado.getTransacoes().size(); j++) {
					System.out.println("  [" + (j + 1) + "] valor " + clienteEncontrado.getTransacoes().get(j));
				}
			}
		}
		return true;
	}
}
