package Ficha5.Ex1;

public class Passageiro {
    private String nome;
    private int num;
    public Passageiro(String nome, int num){
        this.nome = nome;
        this.num = num;
    }
    public int getId(){
        return num;
    }
    public String toString(){
        return nome;
    }
}
