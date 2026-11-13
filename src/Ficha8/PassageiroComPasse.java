package Ficha8;

public final class PassageiroComPasse extends Passageiro{
    private String codigoPasse;
    public PassageiroComPasse(String nome, int nif, String codigoPasse){
        super(nome, nif);
        this.codigoPasse = codigoPasse;
    }
    public double calcularPrecoBilhete(double precoBase){
        return 0.0;
    }

    public String toString(){
        return "[BILHETE] ["+codigoPasse+"] " +getNome()+" ";
    }
}
