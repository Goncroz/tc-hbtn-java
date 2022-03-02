
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collector;
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

	public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(

			List<Pessoa> pessoas) {

		return pessoas.stream()

				.collect(Collectors.groupingBy(Pessoa::getCargo,

						() -> new TreeMap<>(Comparator.reverseOrder()),

						Collectors.toCollection(TreeSet::new)));

	}

	public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> todasPessoas) {
		
		return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
	}

	public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> todasPessoas) {
		
		return todasPessoas.stream()
				.collect(Collectors.groupingBy(
						Pessoa::getCargo, 
						Collectors.groupingBy(Pessoa::getIdade, 
								Collectors.counting())));
	}

	public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> todasPessoas) {
		
		return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(value -> value.getSalario())));
	}

	public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> todasPessoas) {
		
		return todasPessoas.stream()
				.collect(Collectors.groupingBy(
						Pessoa::getCargo, 
						Collectors.flatMapping(
								t -> t.getHobbies()
								.stream(), 
								Collectors.toCollection(TreeSet::new))));
	}	

}
