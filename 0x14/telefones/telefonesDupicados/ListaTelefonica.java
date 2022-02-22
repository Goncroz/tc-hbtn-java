package telefonesDupicados;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ListaTelefonica {
	
	private HashMap<String, HashSet<Telefone>> listaTelefones;
	
	public ListaTelefonica() {
		this.listaTelefones = new HashMap<>();
	}

	public void adicionarTelefone(String nome, Telefone fone) {
		
		HashSet<Telefone> telefones = new HashSet<>();
		telefones = listaTelefones.get(nome);
		
		if(telefones == null) {
			telefones = new HashSet<>();
			telefones.add(fone);
			listaTelefones.put(nome, telefones);
		}
		else {
			HashSet<Telefone> telefonesExistentes = listaTelefones.get(nome);
			if(telefonesExistentes.contains(fone)) {
				throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
			}
			listaTelefones.forEach((nomeListaTelefone, telefonesListaTelefones) -> {
				if(telefonesListaTelefones.contains(fone) && !nomeListaTelefone.equals(nome)) {
					throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
				}
			});
			HashSet<Telefone> listaSemDuplicados = new HashSet<>(telefones);
			listaSemDuplicados.add(fone);
			
			listaTelefones.replace(nome, listaSemDuplicados);
		}
				
	}
	public HashSet<Telefone> buscar(String nome) {		
		return listaTelefones.get(nome);
	}
}
