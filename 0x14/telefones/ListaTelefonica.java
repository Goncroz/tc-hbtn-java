import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaTelefonica {
	
	private HashMap<String, ArrayList<Telefone>> listaTelefones;
	
	public ListaTelefonica() {
		this.listaTelefones = new HashMap<>();
	}

	public void adicionarTelefone(String nome, Telefone fone) {
		
		ArrayList<Telefone> telefones = new ArrayList<>();
		telefones = listaTelefones.get(nome);
		
		if(telefones == null) {
			telefones = new ArrayList<>();
			telefones.add(fone);
			listaTelefones.put(nome, telefones);
		}
		else {
			telefones.add(fone);
		}
				
	}
	public ArrayList<Telefone> buscar(String nome) {		
		return listaTelefones.get(nome);
	}
}
