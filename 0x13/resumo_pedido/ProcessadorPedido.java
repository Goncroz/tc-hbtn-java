import provedores.*;

public class ProcessadorPedido {
	
	private ProvedorFrete provedorFrete;

	public ProcessadorPedido(ProvedorFrete provedorFrete) {
		super();
		this.provedorFrete = provedorFrete;
	}

	public ProvedorFrete getProvedorFrete() {
		return provedorFrete;
	}

	public void setProvedorFrete(ProvedorFrete provedorFrete) {
		this.provedorFrete = provedorFrete;
	}
	
	public void processar(Pedido pedido) {
		Frete frete = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());
		pedido.setFrete(frete);
	}

}
