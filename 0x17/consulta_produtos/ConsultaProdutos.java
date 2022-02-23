
import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterio) {
		List<Produto> produtoFilt = new ArrayList<>();
		produtos.forEach(t -> {
			if(criterio.testar(t)) {
				produtoFilt.add(t);
			}
		});
		return produtoFilt;
	}

}
