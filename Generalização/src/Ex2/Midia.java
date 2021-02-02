package Ex2;

public class Midia extends Item {
	//atributos
	private String gravadora;
	private float duracao;
	
	//construtores
	public Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		setGravadora(gravadora);
		setDuracao(duracao);
	}
	public Midia() {
		
	}
	
	//get e set
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		if (gravadora.length() > 0)
			this.gravadora = gravadora;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	//tostring
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
