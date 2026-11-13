package Ficha6.Ex1;
/**
 * Classe para criar um comboio de mercadorias
 */
public final class ComboioMercadorias extends Comboio{
    private int cargaAtual = 0;
    private int cargaMax;
    /**
     * Construtor de um comboio de mercadorias
     * @param num
     * @param origem
     * @param destino
     * @param velMax
     * @param cargaMax
     */
    public ComboioMercadorias(int num, String origem, String destino, double velMax, int cargaMax){
        super(num, origem, destino, velMax);
        this.cargaMax = cargaMax;
    }
    /**
     * Método para adicionar uma quantidade de toneladas específica no comboio
     * @param carga
     */
    public void carregar(double carga){
        cargaAtual += carga;
        if(cargaAtual > cargaMax){
            cargaAtual = cargaMax;
        }
    }
    /**
     * Método para retirar uma quantidade de toneladas específica no comboio
     * @param carga
     */
    public void descarregar(double carga){
        cargaAtual -= carga;
        if(cargaAtual < 0){
            cargaAtual = 0;
        }
    }
    /**
     * Método que retorna a carga atual que o comboio transporta
     * @return cargaAtual
     */
    public int getCarga(){
        return cargaAtual;
    }
    /**
     * Método que imprime o número de toneladas que o comboio carrega
     */
    public void infMerc(){
        System.out.printf("O comboio leva %d toneladas.", cargaAtual);
    }
}
