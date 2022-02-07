
public class InteiroPositivo {
	
	private int valor;
	private int cont;

	public InteiroPositivo(int valor) {
		super();
		this.valor = new Integer(valor);
	}
	
	public InteiroPositivo(String valor) {
		super();
		this.valor = validaInteiro(Integer.valueOf(valor));
		//this.valor = new Integer(valor);
		
	}
	
	private int validaInteiro(int valor){
		if(valor > 0) {
			return valor;
		}
		else {
			throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
		}
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = validaInteiro(valor);
	}
	
	public boolean ehPrimo() {
		for(int x = 1; x <=valor; x++) {
			if(valor % x == 0) {
				cont++;
			}
		}
		if(cont == 2) {
			return true;
		}
		return false;
	}
	
	

}
