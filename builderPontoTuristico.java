package Doo;

import Doo.PontoTuristico;

public class builderPontoTuristico {
    private PontoTuristico ponto;
    
    public builderPontoTuristico(PontoTuristico ponto) {
    	this.ponto = ponto;
    }
    public void adicionarPontoTuristico(String nome, String descricao, String complemento){        
    	PontoTuristico newPonto = new PontoTuristico();
        newPonto.setNome(nome);
        newPonto.setDescricao(descricao);
        newPonto.setComplemento(complemento);
        this.ponto.setPontoTuristico(newPonto);              
    } 
   
}
