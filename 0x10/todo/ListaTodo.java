import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
	
	List<Tarefa> tarefas = new ArrayList<>();
	
	public ListaTodo() {}

	public ListaTodo(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	public void adicionarTarefa(Tarefa tarefaRealizada) {
		
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == tarefaRealizada.getIdentificador()){
				throw new IllegalArgumentException
				("Tarefa com identificador " + tarefaRealizada.getIdentificador() + " ja existente na lista");				
			}
			if(tarefaRealizada.getDescricao().isEmpty() || tarefaRealizada.getDescricao().equals("")) {
				throw new IllegalArgumentException
				("Descricao de tarefa invalida");
			}
		}
		tarefas.add(tarefaRealizada);
		
	}

	public boolean marcarTarefaFeita(int tarefaMarcada) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == tarefaMarcada) {
				tarefa.setEstahFeita(true);
				return true;
			}
		}
		return false;
		
	}
	
	public boolean desfazerTarefa(int tarefaNaoFeita) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == tarefaNaoFeita) {
				tarefa.setEstahFeita(false);
				return true;
			}
		}
		return false;
	}	
	
	public void desfazerTodas() {
		for(Tarefa tarefa : tarefas) {
			tarefa.setEstahFeita(false);
		}
	}

	public void fazerTodas() {
		for(Tarefa tarefa : tarefas) {
			tarefa.setEstahFeita(true);
		}
		
	}
	
	public void listarTarefas() {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.isEstahFeita()) {
				System.out.println("[X]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
			}
			else {
				System.out.println("[ ]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
			}
		}
		
	}
}


