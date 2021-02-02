package Ex2;

public class Item {
	//atributos
	private int codigo;
	private String descricao;
	
	//construtores
	public Item(int codigo, String descricao) {
		setCodigo(codigo);
		setDescricao(descricao);
	}
	public Item() {
		
	}
	
	//get e set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 0)
			this.descricao = descricao;
	}
	
	//tostring
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
