public class usuario extends pessoa {

	//informações da conta 
	
	protected String nomeDeUsuario;
	private String email;
	private String senha;
	protected String numeroCelular;
	
	//construtor vazio
	
	public usuario() {
		
	}
	
	//construtores
	
	public usuario(String nomeDeUsuario) {
		
		this.nomeDeUsuario = nomeDeUsuario;
	}
			
	public usuario(String nomeDeUsuario,String email,String senha,String numeroCelular,String nomeCompleto,String cpf,int idade) {
		super(nomeCompleto, cpf, idade);
		this.nomeDeUsuario = nomeDeUsuario;
		this.email = email;
		this.senha = senha;
		this.numeroCelular = numeroCelular;
	}
	
	//getters e setters
	
	public void setNomeUser(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}	
	public String getNomeUser() {
		return this.nomeDeUsuario;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public String getNumeroCelular() {
		return this.numeroCelular;
	}
}
