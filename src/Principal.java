
public class Principal {

	public static void main(String[] args) {
				
		
		Cliente fulano = new Cliente("Asdrubal Silva Sauro","1111.222.333-99",TipoPessoa.Fisica );
		
		Cliente funeraria = new Cliente("Funerária Agrícola","55.661.777/0001-88",TipoPessoa.Juridica);
		
		Conta cc = new ContaCorrente(fulano);
		Conta cp = new ContaPoupanca(fulano);
		Conta ccf = new ContaCorrente(funeraria);
			
		
		cc.depositar(500);
		cp.depositar(200);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();		
		
		
		cc.transferir(cp, 55.97);
		cp.sacar(123);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();	
		

		ccf.depositar(50000);
		
		ccf.transferir(cp, 6590);
		ccf.transferir(cp, 600);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		ccf.imprimirExtrato();
		
		//Tentando transferir um valor negativo e mais do que tem de saldo na conta.
		
		ccf.transferir(cp, -444.03);
		cc.transferir(ccf, 10000.00);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		ccf.imprimirExtrato();

		
		
		
		
		
		
		
	}
	
}