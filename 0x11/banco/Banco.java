import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Agencia> agencias = new ArrayList<>();

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
	
	public Agencia buscarAgencia(String agenciaNome) {
		for(int i = 0; i < this.agencias.size(); i++) {
			if (agencias.get(i).getNomeAgencia().equals(agenciaNome)) {
				return agencias.get(i);
			}
		}
		return null;
	}

	public boolean adicionarAgencia(String nomeDaAgencia) {
		Agencia adicionandoAgencia = buscarAgencia(nomeDaAgencia);
		if (adicionandoAgencia != null) {
			return false;
		}
		Agencia buscandoAgencia = new Agencia(nomeDaAgencia);
		agencias.add(buscandoAgencia);
		return true;
	}
	
	/*public boolean adicionarAgencia(String agNova) {
		Agencia agLocalizada = buscarAgencia(agNova);
		if (agLocalizada != null) {
			return false;

		}

		Agencia novaAg = new Agencia(agNova);
		agencias.add(novaAg);
		return true;
	}*/

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
