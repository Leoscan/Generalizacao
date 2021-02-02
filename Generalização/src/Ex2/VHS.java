package Ex2;

public class VHS extends Midia {
	//atributos
	private String titulo;

	//construtores
	public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		setTitulo(titulo);
	}
	public VHS() {
		
	}
	
	//get e set
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if(titulo.length() > 0)
			this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
}
