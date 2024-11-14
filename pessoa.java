abstract class pessoa{

    //dados do usuário

    protected String nomeCompleto;
    protected String cpf;
    protected int idade;

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
    //dados
    abstract void setCpf(String cpf);
    abstract void setNomeCompleto(String NomeCompleto);
    abstract void setIdade(int idade);
}
