package Doo;

import java.util.Date;

public class check_in {
    private Date data;
    private String localizacao;
    private String nome_ponto;

    
    public Date getData(){
        return data;
    }

    public void setData(Date data){
        this.data = data;
    }
    
    public String getLocalizacao(){
        return localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    
    public String getNomePonto(){
        return nome_ponto;
    }

    public void setNomePonto(String NomePonto){
        this.nome_ponto = NomePonto;
    }
}
