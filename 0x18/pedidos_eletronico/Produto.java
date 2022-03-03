

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Produto {
	
	private int codigo;
	private String nome;
	private CategoriaProduto categoria;
	private double preco;
	
	public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
	
	public Produto() {}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "["+getCodigo()+"] "+ getNome()+" "+getCategoria()+
				" R$ " +String.format("%.2f", getPreco());
	}

}