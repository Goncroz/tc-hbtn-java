

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

		List<Produto> listaProd = pedido.getProdutos().stream().filter(p -> p.getCategoria() == CategoriaProduto.LIVRO)
				.collect(Collectors.toList());

		return listaProd;

	}
	
	public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        
		return produtos.stream()
				.sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().orElse(null);
	}

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int menorPreco) {
		
		return produtos.stream().filter(t -> t.getPreco() >= menorPreco).collect(Collectors.toList());
	}

	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {
		
		List<Pedido> pedidosEletronicos = new ArrayList<Pedido>(pedido);
		
	 return pedidosEletronicos.stream()
				.filter(t -> t.getProdutos().stream()
						.anyMatch(p -> p.getCategoria() == CategoriaProduto.ELETRONICO)).collect(Collectors.toList());
	}

	public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
		
		 return produtos.stream()
	                .map(produto ->
	                {
	                    if (produto.getCategoria().equals(CategoriaProduto.ELETRONICO))
	                        produto.setPreco(produto.getPreco() - produto.getPreco() * 0.15);
	                    return produto;
	                }).collect(Collectors.toList());
	}

}
