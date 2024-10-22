
public class pessoa{
	
	//dados do usuário
	
	private String nomeCompleto;
	private String cpf;
	public int idade;
	
	//construtores
	
	public pessoa() {
		
	}
	
	public pessoa(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public pessoa(String nomeCompleto,String cpf,int idade) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.idade = idade;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNomeCompleto() {
		return this.nomeCompleto;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
}
