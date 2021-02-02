package Ex3;

public class ContaEspecial extends Conta {
	//Atributos
	private int diasSemJuros;
	private double limite;

	//construtores
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numeroconta, saldo);
		this.diasSemJuros = diasSemJuros;
		this.limite = limite;
	}
	public ContaEspecial() {
		
	}
	
	//get e set
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//tostring
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
