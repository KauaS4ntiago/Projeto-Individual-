public class usuario extends pessoa implements Ilogin {

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

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }
    public String getNomeDeUsuario() {
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
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    public String getNumeroCelular() {
        return this.numeroCelular;
    }

}
