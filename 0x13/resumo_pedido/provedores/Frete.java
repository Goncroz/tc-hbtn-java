package provedores;
public class Frete {
	private double valor;
	private TipoProvedorFrete tipoProvedorFrete;
	
	
	public Frete(double valor, provedores.TipoProvedorFrete tipo) {
		super();
		this.valor = valor;
		this.tipoProvedorFrete = tipo;
	}


	public double getValor() {
		return valor;
	}

	public TipoProvedorFrete getTipoProvedorFrete() {
		return tipoProvedorFrete;
	}

}
