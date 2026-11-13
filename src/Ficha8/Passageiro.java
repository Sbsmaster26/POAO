package Ficha8;
public sealed class Passageiro permits PassageiroIdoso, PassageiroComPasse{
    private String nome;
    private int nif;
    public Passageiro(String nome, int nif){
        this.nome = nome;
        this.nif = nif;
    }
    public int getNif(){
        return nif;
    }
    public String getNome(){
        return nome;
    }
    public double calcularPrecoBilhete(double precoBase){
        return precoBase;
    }
    public String toString(){
        return "[BILHETE] Passageiro "+nome+" ";
    }
}
