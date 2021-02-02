
public class Main {

	public static void main(String[] args) {
		
		//Pessoa
		Pessoa a = new Pessoa("Leonardo", "Rio do Sul");
		System.out.println(a);
		Pessoa b = new Pessoa();
		b.setNome("Fernando");
		b.setEndereco("Canta Galo");
		System.out.println(b);
		
		System.out.println("\n");
		
		//Pessoa Fisica
		PessoaFisica af = new PessoaFisica("Ana", "Canta Galo", "123.123.123-12", "casado");
		System.out.println(af);
		
		PessoaFisica bf = new PessoaFisica("Ricardo", "São Paulo");
		bf.setCpf("222.222.222-09");
		bf.setEstadoCivil("Solteiro");
		System.out.println(bf);
		
		PessoaFisica cf = new PessoaFisica();
		cf.setNome("Victor");
		cf.setEndereco("Balneario");
		cf.setCpf("222.222.222-10");
		cf.setEstadoCivil("Solteiro");
		System.out.println(cf);
		
		System.out.println("\n");
		
		//Pessoa Juridica
		PessoaJuridica aj = new PessoaJuridica("liquigas", "São Paulo", "60.886.413/0110-09", "Empresa de gás");
		System.out.println(aj);
		
		PessoaJuridica bj = new PessoaJuridica("33.000.167/1002-46", "Empresa de Petroleo");
		bj.setNome("Petrobras");
		bj.setEndereco("BR");
		System.out.println(bj);
		
		PessoaJuridica cj = new PessoaJuridica();
		cj.setNome("Itau");
		cj.setEndereco("Avenida Brasil");
		cj.setCnpj("60.872.504/0001-23");
		cj.setTipoEmpresa("Banco");
		System.out.println(cj);
		System.out.println("\n");	
	}		
}
