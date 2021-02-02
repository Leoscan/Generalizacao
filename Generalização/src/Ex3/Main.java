package Ex3;

public class Main {

	public static void main(String[] args) {
		//conta
		Conta ca = new Conta();
		ca.setBanco("Itau");
		ca.setAgencia(329);
		ca.setNumeroconta(12345);
		ca.setSaldo(789);
		System.out.println(ca);
		
		if(ca.deposito(28)) {
			System.out.println("Deposito efetuado, Novo saldo "+ca.getSaldo());
		} else {
			System.out.println("Erro ao efetuar deposito");
		}
		
		Conta cb = new Conta("Santander", 222, 12333, 1390);
		System.out.println(cb);
		
		if(cb.saque(900)) {
			System.out.println("Novo saldo "+cb.getSaldo());
		} else {
			System.out.println("Saldo Insuficiente");
		}
		System.out.println("\n");
		
		//ContaSimples
		ContaSimples csa = new ContaSimples();
		csa.setBanco("Bradesco");
		csa.setAgencia(322);
		csa.setNumeroconta(33345);
		csa.setSaldo(1234);
		csa.setSaldoPoupanca(123333);
		System.out.println(csa);
		
		if(csa.depositoPoupanca(788)) {
			System.out.println("Deposito efetuado na poupanca, Novo saldo "+csa.getSaldoPoupanca());
		} else {
			System.out.println("Erro ao efetuar deposito na poupanca");
		}
		
		ContaSimples csb = new ContaSimples("Banco do Brasil", 213, 334523, 2233440, 343422324);
		System.out.println(csb);
		
		if(csb.saquePoupanca(90000)) {
			System.out.println("Saque Efetuado, conta poupança, Novo saldo "+csb.getSaldo());
		} else {
			System.out.println("Saldo Insuficiente na conta poupança");
		}
		System.out.println("\n");
		
		//ContaEspecial
		ContaEspecial cea = new ContaEspecial();
		cea.setBanco("Itau");
		cea.setAgencia(4321);
		cea.setNumeroconta(00);
		cea.setSaldo(30000);
		cea.setDiasSemJuros(30);
		cea.setLimite(0);
		System.out.println(cea);
		
		ContaEspecial ceb = new ContaEspecial("Banco internacional", 777, 003, 10989, 45, 200);
		System.out.println(ceb);
	}

}
