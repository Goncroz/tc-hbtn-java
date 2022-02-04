import produtos.Produto;
import produtos.Dvd;
import produtos.Livro;

public class Pedido {
	
	private double percentualDesconto;
	private ItemPedido[] itens;
	
	public Pedido(double percentualDesconto, ItemPedido[] itens) {
		super();
		this.percentualDesconto = percentualDesconto;
		this.itens = itens;
	}
	
	
	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public ItemPedido[] getItens() {
		return itens;
	}

	public void setItens(ItemPedido[] itens) {
		this.itens = itens;
	}

	public double calcularTotal() {
		double total=0;
		for (ItemPedido item : itens) {
			total +=(item.getProduto().obterPrecoLiquido()*item.getQuantidade());
		}
	return total - (total * (percentualDesconto / 100));
}
}
