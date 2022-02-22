package telefonesDupicados;



import java.util.Objects;

public class Telefone {
	
	private String codigoArea;
	private String numero;
	
	public Telefone(String codigoArea, String numero) {
		super();
		this.codigoArea = codigoArea;
		this.numero = numero;
	}

	public Telefone() {
		super();
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "(" + this.codigoArea + ") " + this.numero;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + ((codigoArea == null) ? 0 : codigoArea.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(codigoArea, other.codigoArea) && Objects.equals(numero, other.numero);
	}
	
	

}
