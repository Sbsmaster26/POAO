package Ficha10.Ex1;

public abstract class Comboio {
    private int id;
    private int capMax;
    private int tempo;

    public Comboio(int id, int capMax, int tempo){
        this.id = id;
        this.capMax = capMax;
        this.tempo = tempo;
    }

    public abstract int nivelPrioridade();
    public abstract String anuncio();
}
