

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

}
