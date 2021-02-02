package Ex2;

public class Main {

	public static void main(String[] args) {

		//Item 
		Item ia = new Item();
		ia.setCodigo(1);
		ia.setDescricao("Disco");
		System.out.println(ia);
		
		Item ib = new Item(2, "Livro");
		System.out.println(ib);
		
		System.out.println("\n");
		
		//Livro
		Livro la = new Livro();
		la.setCodigo(3);
		la.setDescricao("Livro");
		la.setAutor("Clarisse");
		System.out.println(la);
		
		Livro lb = new Livro(4, "Livro", "Thiago");
		System.out.println(lb);
		
		System.out.println("\n");
		
		//Midia
		Midia ma = new Midia();
		ma.setCodigo(5);
		ma.setDescricao("Midia");
		ma.setGravadora("Aquario");
		ma.setDuracao(2);
		System.out.println(ma);
		
		Midia mb = new Midia(6, "Midia", "Avanco", 22.2f);
		System.out.println(mb);
		
		System.out.println("\n");
		
		//cd
		CD ca = new CD();
		ca.setCodigo(7);
		ca.setDescricao("cd");
		ca.setGravadora("Aquario");
		ca.setDuracao(33.1f);
		ca.setFaixas(8);
		ca.setArtista("Roberto");
		ca.setAlbum("Peixes Malucos");
		System.out.println(ca);
		
		CD cb = new CD(8, "cd", "Tempo", 60, 9, "Maria", "Album zero");
		System.out.println(cb);
	
		System.out.println("\n");
		
		//VHS
		VHS va = new VHS();
		va.setCodigo(9);
		va.setDescricao("VHS");
		va.setGravadora("Avanco");
		va.setDuracao(98);
		va.setTitulo("Os Programadores");
		System.out.println(va);
		
		VHS vb = new VHS(10, "vhs", "avanco Shows", 128, "Show Roberto");
		System.out.println(vb);
		
	}

}
