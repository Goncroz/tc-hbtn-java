

import java.util.Map;
import java.util.TreeMap;

public class Armazem<E> implements Armazenavel<E> {
	
	Map<String, E> itensArmazenados = new TreeMap<>();


	public void adicionarAoInventario(String nome, E valor) {
		itensArmazenados.put(nome, valor);
		
	}


	public E obterDoInventario(String nome) {
		return itensArmazenados.get(nome);
	}

}
