
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{
	
	private int codigo;
	private String nome;
	private String cargo;
	private int idade;
	private double salario;
	private List<String> hobbies= new ArrayList<String>();
	

	public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		this.setHobbies(hobbies);
	}
	

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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}


	@Override
	public String toString() {
		return "[" + codigo + "] " + nome + " " + cargo + " " + idade + " R$ " + String.format("%.6f", salario);
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
			return this.getNome().compareTo(outraPessoa.getNome());
	}

}
