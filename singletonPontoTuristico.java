
public class singletonPontoTuristico {
    private static singletonPontoTuristico instance;
    private int id;
    private String nome;
    private String complemento;
    private String descricao;

    private singletonPontoTuristico(){}

    public synchronized static singletonPontoTuristico getInstance()
    {
        if(instance == null)
        {
            instance = new singletonPontoTuristico();
        }
        return instance;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public String getDescricao(){
        return this.descricao;
    }

}
