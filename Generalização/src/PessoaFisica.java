
public class PessoaFisica extends Pessoa {
	
	// atributos
	private String cpf;
	private String estadoCivil;

	//construtores
	public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}
	public PessoaFisica(String nome, String endereco) {
		super(nome, endereco);
	}
	public PessoaFisica() {
	}
	
	
	//get e set
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (cpf.length() > 0)
			this.cpf = cpf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 0)
			this.estadoCivil = estadoCivil;
	}
	
	//tostring
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
