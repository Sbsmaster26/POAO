package Ficha6.Ex1;


/**Classe para criar um passageiro
 *
 */

public class Passageiro {
    private String nome;
    private int num;
    private double desconto;
    /**
     * Contrutor do passageiro
     * @param nome nome do passageiro
     * @param num número de indentificação do passageiro
     * @param desconto desconto no preço do bilhete
     */
    public Passageiro(String nome, int num, double desconto){
        this.nome = nome;
        this.num = num;
        this.desconto = desconto;
    }
    /**
     * Método que retorna o número de identificação do passageiro
     * @return num
     */
    public int getId(){
        return num;
    }
    /**    (non-Javadoc)
     * Retorna o nome do passageiro
     * @see java.lang.Object#toString()
     * @return nome
     */
    public String toString(){
        return nome;
    }
    /**
     * Retorna o desconto do bilhete do passageiro
     * @return desconto
     */
    public double getdiscount(){
        return desconto;
    }
    /**
     * Imprime a informação do passageiro no terminal
     */
    public void inf(){
        if(desconto != 0){
            System.out.printf("O passageiro %s, nº %d, tem %.2f porcento de desconto no preço do bilhete.\n",toString(), getId(), getdiscount());
        }else{
            System.out.printf("O passageiro %s, nº %d, não tem desconto no preço do bilhete.\n",toString(), getId());
        }
    }
}

