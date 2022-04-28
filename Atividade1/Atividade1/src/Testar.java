// Laura Caroline Pinto Correia 20.00171-0

public class Testar {
    private int idBem;
    private int teste;
    private String carro;
    private String moto;
    private String bicicleta;
    private String patinete;

    public Testar(String carro, String moto, String bicicleta, String patinete){
        this.carro = carro;
        this.moto = moto;
        this.bicicleta = bicicleta;
        this.patinete = patinete;
    }

    public String getCarro(){
        return carro;
    }

    public String getMoto(){
        return moto;
    
    }

    public String getBiciclieta(){
        return bicicleta;
    }

    public String getPatinete(){
        return patinete;
    }


}
