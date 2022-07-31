
public class Cliente {
	private String nome;
	private String CPF_CNPJ;
	private TipoPessoa tipoPessoa;
	
	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF_CNPJ;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public Cliente(String nome, String CPF_CNPJ, TipoPessoa tipoPessoa) {
		this.nome = nome;
		this.CPF_CNPJ = CPF_CNPJ;
		this.tipoPessoa = tipoPessoa;
	}
	
	
	
	
	

}
