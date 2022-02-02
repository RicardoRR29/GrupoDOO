import Doo.singletonPontoTuristico;


/**
 *
 * @author Eduardo, Matheus, Ricardo, Thiago 
 */
public class instanciaSingleton {
                                      
    public singletonPontoTuristico singleton() throws Exception{
        singletonPontoTuristico single;
        single = singletonPontoTuristico.getInstance();
        single.setId(1);
    	return single;
        }
    }
      