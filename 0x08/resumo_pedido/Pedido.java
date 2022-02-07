import produtos.Livro;
import produtos.Produto;

public class Pedido{
	private int percentualDesconto;
	private ItemPedido[] itens;
	
	private Livro livro;
	private Produto produtos;
	private ItemPedido item;
	private double total=0;
	private double total1;
	
	public Produto produto;
	
	public Pedido(int percentualDesconto, ItemPedido[] itens) {
		super();
		this.percentualDesconto = percentualDesconto;
		this.itens = itens;
	}
	

	public int getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(int percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public void setItens(ItemPedido[] itens) {
		this.itens = itens;
	}

	public ItemPedido[] getItens() {
		return itens;
	}

	
	public double calcularTotal() {
		double xx = 0;
		for (ItemPedido itemPedido : itens) {
			xx += (itemPedido.getProduto().obterPrecoLiquido(itemPedido.getProduto().getPrecoBruto())*itemPedido.getQuantidade());
		}
		
		return xx - (xx * percentualDesconto / 100 );
	}
	
	public void apresentarResumoPedido() {
		System.out.println("------- RESUMO PEDIDO -------");
		for (ItemPedido item : itens){
			total1 += (item.getProduto().obterPrecoLiquido(item.getProduto().getPrecoBruto())* item.getQuantidade());
		
			String tipo = item.getProduto().getClass().getName();
		System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",tipo.replace("produtos.", "")
		,item.getProduto().getTitulo()
		,item.getProduto().obterPrecoLiquido(item.getProduto().getPrecoBruto())
		,item.getQuantidade() 
		,item.getProduto().obterPrecoLiquido(item.getProduto().getPrecoBruto())* item.getQuantidade());
		}
		System.out.println("----------------------------");
		System.out.printf("DESCONTO: %.2f\n", (total1 * percentualDesconto / 100));
		System.out.printf("TOTAL PRODUTOS: %.2f\n", total1);
		System.out.println("----------------------------");
		System.out.printf("TOTAL PEDIDO: %.2f\n", total1 - (total1 * percentualDesconto / 100) );
		System.out.println("----------------------------");
	}
		//System.out.printf("DESCONTO: %.2f\n",percentualDesconto );	
	
		
	
		
		
	}

	
