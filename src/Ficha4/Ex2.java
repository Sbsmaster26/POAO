package Ficha4;



class Estacao{
    private String nome;
    private double posicao;

    public Estacao(String nome, double posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public String toString(){
        return "Estação de "+nome+", km "+posicao+".";
    }

}
