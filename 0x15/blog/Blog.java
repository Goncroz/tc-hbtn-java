

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
	
	private List<Post> posts;

	public Blog() {
		posts = new ArrayList<>();
	}

	public void adicionarPostagem(Post postagem) {
		posts.add(postagem);
		
	}

	public Set<String> obterTodosAutores() {
		Set<String> autores = new TreeSet<>();
		for (Post post : posts) {
			autores.add(post.getAutor());
		}
		return autores;
	}

	public Map<String, Integer> obterContagemPorCategoria() {
		Map<String, Integer> obterContagem = new TreeMap<>();
		
		for (Post post : posts) {
			String categoria = post.getCategoria();
			Integer contador = obterContagem.get(categoria);
			
			if(contador == null) {
				obterContagem.put(categoria, 1);
			}
			else {
				contador++;
				obterContagem.replace(categoria, contador);
			}
		}
		return obterContagem;
	}
	
	
	
	
	
	

}
