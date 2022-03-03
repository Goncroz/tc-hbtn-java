

import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> extends Midia{

	private List<T> valores = new ArrayList<>();

	public void adicionarMidia(T tipo) {
		valores.add(tipo);
		
	}

	public List<T> obterListaMidias() {
		
		return valores;
	}
	
	

}
