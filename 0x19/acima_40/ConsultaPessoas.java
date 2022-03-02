

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaPessoas {

	public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> todasPessoas) {
		
		Map<String, List<Pessoa>> findByCargo = todasPessoas.stream().collect(Collectors.groupingBy(t -> t.getCargo()));
		
		
		return findByCargo;
	}

	public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> todasPessoas) {
		
		Map<String, List<Integer>> findByIdade = todasPessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, Collectors.toList())));
		
		
		return findByIdade;
	}

	public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> todasPessoas) {
		
		 Map<String, List<Pessoa>> findByQuarentaMais = todasPessoas.stream()
				.collect(Collectors.groupingBy(
						Pessoa::getCargo, Collectors.filtering(p -> p.getIdade() >= 40, Collectors.toList())));
		
		 return findByQuarentaMais;
	}
	
	
	
	

}
