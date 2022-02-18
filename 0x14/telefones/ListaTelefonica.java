import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaTelefonica {
	
	private HashMap<String, ArrayList<Telefone>> listaTelefones;
	
	
	public ListaTelefonica(HashMap<String, ArrayList<Telefone>> listaTelefones) {
		super();
		this.listaTelefones = listaTelefones;
	}
	public ListaTelefonica() {
		super();
		listaTelefones = new HashMap<>();
	}	
	public void adicionarTelefone(String nome, Telefone fone) {
		if(listaTelefones.containsKey(nome)) {
			listaTelefones.get(nome).add(fone);			
		}
		else {
			ArrayList<Telefone> info = new ArrayList<Telefone>();
			info.add(fone);
			listaTelefones.put(nome, info);
		}	
	}
	public ArrayList<Telefone> buscar(String nome) {		
		return listaTelefones.get(nome);
	}
}
