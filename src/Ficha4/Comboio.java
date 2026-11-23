package Ficha4;


class Comboio {
    private int num;
    private String tipo;
    private double velMax;
    private double velAtual = 0.0;
    private Estacao origem;
    private Estacao destino;

    public Comboio(int num, String tipo, double velMax, Estacao origem, Estacao destino){
        this.num = num;
        this.tipo = tipo;
        this.velMax = velMax;
        if(velAtual >= velMax){
            velAtual = velMax;
        }
        this.origem = origem;
        this.destino = destino;
    }

    public String toString(){
        return "O COMBOIO " + num + " TIPO " +  tipo + " viaja a uma velocidade de " + velAtual +
               "\nOrigem: " + origem.toString() + 
               "\nDestino: " + destino.toString();
    }

    public void acelerar(double valorAumento){
        if(valorAumento >= 0){
            velAtual += valorAumento;
        }
        if(velAtual > velMax){
            velAtual = velMax;
        }
    }

    public void travar(double valorTravagem){
        if(valorTravagem >= 0){
            velAtual -= valorTravagem;
        }
        if(velAtual < 0){
            velAtual = 0;
        }
    }

    // public double calcularDistancia(){
    //     return Math.abs(); 
    // }
}
class ControloFerrovia {
    public static void main(String[] args){
        Estacao e1 = new Estacao("Lisboa", 0.0);
        Estacao e2 = new Estacao("Coimbra", 100.0);
        Comboio c = new Comboio(204, "R", 120, e1, e2);
        System.out.println(c);
        // c.acelerar(100);
        // System.out.println(c);
    }
}

class Estacao{
    private String nome;
    private double posicao;

    public Estacao(String nome, double posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public String toString(){
        return "Estação de " + nome + ", km " + posicao + ".";
    } 
}