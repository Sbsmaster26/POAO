package Ficha6.Ex1;

/**
 * Classe que permite criar comboios de mercadorias e passageiros
 */

public sealed class Comboio permits ComboioPassageiros, ComboioMercadorias{
    private int num;
    private String origem;
    private String destino;
    private double velAtual = 0.0;
    private double velMax;
    /**
     * Contrutor de um comboio
     * @param num
     * @param origem
     * @param destino
     * @param velMax
     */
    public Comboio(int num, String origem, String destino, double velMax){
        this.num = num;
        this.origem = origem;
        this.destino = destino;
        this.velMax = velMax;
    }
    /**
     * Método que aumenta a velocidade atual de um comboio
     * @param valorAumento
     */
    public void acelerar(double valorAumento){
        if(valorAumento >= 0){
            velAtual += valorAumento;
        }
        if(velAtual > velMax){
            velAtual = velMax;
        }
    }
    /**
     * Método que diminui a velocidade de um comboio
     * @param valorTravagem
     */
    public void travar(double valorTravagem){
        if(valorTravagem >= 0){
            velAtual -= valorTravagem;
        }
        if(velAtual < 0){
            velAtual = 0;
        }
    }
    /**    (non-Javadoc)
     * Método que retorna as informações do comboio
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "O comboio "+num+", a realizar o percurso "+origem+"->"+destino+", viaja a uma velocidade de "+ velAtual +"km/h";
    }
    /**
     * Método que imprime as informações do comboio
     */
    public void info(){
        System.out.printf("%s\n", toString());
    }
    /**
     * Método que retorna a velocidade atual do comboio
     * @return velAtual
     */
    public double getVelAtual(){
        return velAtual;
    }
}