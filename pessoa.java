public abstract class Pessoa {

	// dados do usuário

	protected String nomeCompleto;
	protected String cpf;
	public int idade;

	// construtores

	public Pessoa() {

	}

	public Pessoa(String nomeCompleto, String cpf, int idade) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.idade = idade;
	}

	// métodos getters e setters

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
