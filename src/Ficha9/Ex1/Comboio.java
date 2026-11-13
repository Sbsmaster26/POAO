package Ficha9.Ex1;

abstract sealed class Comboio permits ComboioRegional, ComboioIntercidades, ComboioMercadoria{
    private int codigo;
    private String designacao;
    private double velMax;
    
    public Comboio(int codigo, String designacao, double velMax){
        this.codigo = codigo;
        this.designacao = designacao;
        this.velMax = velMax;
    }
    
}
