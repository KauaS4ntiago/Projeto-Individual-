public class Usuario extends Pessoa implements Ilogin {

	// informações da conta

	private String nomeDeUsuario;
	private String email;
	private String senha;
	private String numeroCelular;

	// construtores

	public Usuario() {

	}

	public Usuario(String nomeDeUsuario, String senha) {
		this.nomeDeUsuario = nomeDeUsuario;
		this.senha = senha;
	}

	public Usuario(String nomeDeUsuario, String email, String senha, String numeroCelular, String nomeCompleto,
			String cpf, int idade) {
		super(nomeCompleto, cpf, idade);
		this.nomeDeUsuario = nomeDeUsuario;
		this.email = email;
		this.senha = senha;
		this.numeroCelular = numeroCelular;
	}

	// getters e setters

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

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getNumeroCelular() {
		return this.numeroCelular;
	}

	public boolean autenticao(String nomeDeUsuario, String senha) {
		if (this.nomeDeUsuario.equals(nomeDeUsuario) && this.senha.equals(senha)) {
			System.out.println("Login efetuado! Bem vindo de volta " + nomeDeUsuario);
				return true;
		} else {
			System.out.println("Login não efetuado! Certifique-se de que as informações estejam corretas.");
				return false;
		}
	}

}
