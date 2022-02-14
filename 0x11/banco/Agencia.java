import java.util.ArrayList;
import java.util.List;

public class Agencia {

	private String nomeAgencia;
	private ArrayList<Cliente> clientes;
	//private List<Cliente> clientes = new ArrayList<>();

	public Agencia(String nomeAgencia) {
		super();
		this.nomeAgencia = nomeAgencia;
		this.clientes = new ArrayList<>();
	}
	
	public Agencia() {
		
	}

	public String getNomeAgencia(String nomeAgencia) {
		return nomeAgencia;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public boolean novoCliente(String nomeDoCliente, double valorDaTransacaoInicial) {
		Cliente clienteNovo = buscarCliente(nomeDoCliente);
		if(clienteNovo != null) {
			return false;
		}
		Cliente novoCliente = new Cliente(nomeDoCliente, valorDaTransacaoInicial);
		clientes.add(novoCliente);
		
		return true;
	}

	public boolean adicionarTransacaoCliente(String nomeDoCliente, double valorDaTransacaoInicial) {
		Cliente adicionandoTransacao = buscarCliente(nomeDoCliente);
		if(adicionandoTransacao == null) {
			return false;
		}
		adicionandoTransacao.adicionarTransacao(valorDaTransacaoInicial);
		return true;
	}

	public Cliente buscarCliente(String nomeDoCliente) {
		for(int i = 0; i < this.clientes.size(); i++) {
			if(this.clientes.get(i).getNomeDoCliente().equals(nomeDoCliente)) {
				return clientes.get(i);
			}
		}
		return null;
	}

}
