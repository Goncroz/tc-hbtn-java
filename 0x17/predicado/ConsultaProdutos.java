


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
	
	

	public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> pred) {
		
		List<Produto> produtoFilt = new ArrayList<>();
		
		produtos.forEach(t -> {
			if(pred.test(t)) {
				produtoFilt.add(t);
			}
		});
		return produtoFilt;
	}

}
