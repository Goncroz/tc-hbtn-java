
public class Departamento {
	
	Double valorMeta;
	Double valorAtingidoMeta;
	
	public double getValorMeta() {
		return valorMeta;
	}
	public double getValorAtingidoMeta() {
		return valorAtingidoMeta;
	}
	public Departamento(double valorMeta, double valorAtingidoMeta) {
		this.valorMeta = valorMeta;
		this.valorAtingidoMeta = valorAtingidoMeta;
	}
	
	public Boolean alcancouMeta(){
		if(this.valorAtingidoMeta >= this.valorMeta) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
