

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {

	public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> todasPessoas) {
		
		Map<String, List<Pessoa>> findByCargo = todasPessoas.stream().collect(Collectors.groupingBy(t -> t.getCargo()));
		
		
		return findByCargo;
	}
	
	

}
