package Doo;


import Doo.PontoTuristico;
import Doo.usuario;

/**
 *
 * @author felipe
 */
public class diretorPontoTuristico {
    
    public diretorPontoTuristico(){                
    }                                    
    public PontoTuristico builder(usuario user) throws Exception{
    	PontoTuristico ponto = new PontoTuristico();
    	user.isActive(1);
    	return ponto;
        }
    }
      