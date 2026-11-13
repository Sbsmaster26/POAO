package Ficha8;

public final class PassageiroIdoso extends Passageiro{
    private int idade;

    public PassageiroIdoso(String nome, int nif, int idade){
        super(nome, nif);
        this.idade = idade;
    }
    public double calcularPrecoBilhete(double precoBase){
        return precoBase*0.5;
    }
    public String toString(){
        return "[BILHETE] [>65] " +getNome()+" ("+idade+") ";
    }
}
