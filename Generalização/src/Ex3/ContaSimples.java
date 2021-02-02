package Ex3;

public class ContaSimples extends Conta {
	//atributos
	private double saldoPoupanca;

	//construtores
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numeroconta, saldo);
		setSaldoPoupanca(saldoPoupanca);
	}
	public ContaSimples() {
		
	}

	
	//get e set
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	//metodos
	
	public boolean depositoPoupanca(double valor) {
		saldoPoupanca += valor;
		return true;
	}
	
	public boolean saquePoupanca(double valor) {
		if(saldoPoupanca > valor) {
			saldoPoupanca -= valor;
			return true;
		} else {
			return false;
		}
	}
}
