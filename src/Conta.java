
public class Conta {	
	
	
	public static final int AGENCIA_PADRAO = 1;
	public static int sequencial = 1;
	private double saldo;
	private int numero;
	private Cliente cliente;
	
	private int agencia;
	
	public Conta(Cliente cliente){
		this.cliente = cliente;
		this.numero = sequencial;
		this.agencia = AGENCIA_PADRAO;
		sequencial++;
	};	

	
	public boolean sacar(double valor) {
		if(this.saldo>=valor) {
			this.saldo -=valor;			
			return true;
		}				
		return false;
	}

	
	public  boolean depositar(double valor) {
		if(valor>0) {
			this.saldo +=valor;			
			return true;
		}				
		return false;
	}

	
	public boolean transferir(Conta destino, double valor) {
		if(valor>0 && this.sacar(valor)) {
			destino.depositar(valor);			
			return true;
		}				
		return false;
	}


	public double getSaldo() {
		return saldo;
	}


	public int getNumero() {
		return numero;
	}


	public int getAgencia() {
		return agencia;
	}


	
	public void detalhesConta() {
		System.out.println( "      Nome do títular: "+ cliente.getNome()
				+ "\n      Saldo= " + saldo + "\n      "				+ 
							"Numero= " + numero + "\n      "+ 
							"Agencia= " + agencia + " \n"); 
			
	}


	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}





}
