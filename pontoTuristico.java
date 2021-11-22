package Doo;


public class PontoTuristico {
    private String nome;
    private String complemento;
    private String descricao;
    
    public void setPontoTuristico(PontoTuristico ponto){
        this.nome = ponto.nome;
        this.complemento = ponto.complemento;
        this.descricao = ponto.descricao;
        
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
