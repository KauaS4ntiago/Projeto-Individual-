
public class Assinatura {
	 	private String nomeAssinatura;
	    private String descricaoAssinatura;
	    private double precoAssinatura;
	    private int qtdTelas; // Quantidade de telas simultaneamente
	    private String conteudoAdicional; // 4k, Dolby Vision e etc...
	    
	    // Construtores
	    
	    public Assinatura(){

	    }
	    
	    public Assinatura( String nomeAssinatura){
	        this.nomeAssinatura = nomeAssinatura;
	    }

	    
	    public Assinatura( String nomeAssinatura, String descricaoAssinatura, double precoAssinatura, int qtdTelas, String conteudoAdicional){
	        this.nomeAssinatura = nomeAssinatura;
	        this.descricaoAssinatura = descricaoAssinatura;
	        this.precoAssinatura = precoAssinatura;
	        this.qtdTelas = qtdTelas;
	        this.conteudoAdicional = conteudoAdicional;
	    }
	    
	    //getters e setters
	    
	    public void setNomeDaAssinatura(String nomeAssinatura){
	        this.nomeAssinatura = nomeAssinatura;
	    }

	    public String getNomedaAssinatura(){
	        return this.nomeAssinatura;
	    }

	    public void setDescricaoDaAssinatura(String descricaoAssinatura){
	        this.descricaoAssinatura = descricaoAssinatura;
	    }

	    public String getDescricaoDaAssinatura(){
	        return this.descricaoAssinatura;
	    }

	    public void setPrecoAssinatura(double precoAssinatura){
	        this.precoAssinatura = precoAssinatura;
	    }

	    public double getPrecoAssinatura(){
	        return this.precoAssinatura;
	    }

	    public void setQtdTelas(int qtdTelas){
	        this.qtdTelas = qtdTelas;
	    }

	    public int getQtdTelas(){
	        return this.qtdTelas;
	    }

	    public void setConteudoAdicional(String conteudoAdicional){
	        this.conteudoAdicional = conteudoAdicional;
	    }

	    public String getConteudoAdicional(){
	        return this.conteudoAdicional;
	    }

	}

