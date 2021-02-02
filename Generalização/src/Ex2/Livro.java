package Ex2;

public class Livro extends Item {
	//atributos
	private String autor;

	// construtor
	
	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		setAutor(autor);
	}
	public Livro() {
		
	}
	
	//get e set
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if (autor.length() > 0)
			this.autor = autor;
	}
	
	//tostring
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
