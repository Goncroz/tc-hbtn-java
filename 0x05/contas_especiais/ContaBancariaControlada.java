

public class ContaBancariaControlada extends ContaBancariaBasica{
	
	private double saldoMinimo;
	private double valorPenalidade = 5;
	
	public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo,
			double valorPenalidade) {
		
		super(numeracao, taxaJurosAnual);
		this.saldoMinimo = saldoMinimo;
		this.valorPenalidade = valorPenalidade;
	}
	
	public void aplicarAtualizacaoMensal() {
		this.saldo = saldo - calcularTarifaMensal() + calcularJurosMensal() - valorPenalidade;

	}
	

}
