package Ficha6.Ex1;
import java.util.ArrayList;

/**
 * Classe para criar um comboio de passageiros
 */

public final class ComboioPassageiros extends Comboio{
    private double price;
    private int capMax;
    private ArrayList<Passageiro> passageiros;
    /**
     * Construtor para comboios de passageiros
     * @param num
     * @param origem
     * @param destino
     * @param velMax
     * @param price
     * @param capMax
     */
    public ComboioPassageiros(int num, String origem, String destino, double velMax, double price, int capMax){
        super(num, origem, destino, velMax);
        passageiros = new ArrayList<Passageiro>(); 
        this.price = price;
        this.capMax = capMax;
    }
    /**
     * Método que procura um passageiro atraver do seu número e retorna as suas informações
     * @param num
     */
    public void Procurar(int num){
        Passageiro p = passageiros.get(find(num));
        System.out.printf("Nome: %s; Número: %d", p.getId(), p.toString());
    }
    /**
     * Método para listar as informações de todos os passageiros
     */
    public void listarPassageiros(){
        for(int i=0; i<passageiros.size(); i++){
            System.out.printf("Nome: %s; Número: %d",passageiros.get(i).toString(), passageiros.get(i).getId()); 
        }
    }
    /**
     * Método que através do número de identificação do passageiro retorna o seu índice
     * @param num
     * @return i
     */
    private int find(int num){
        for(int i=0; i<passageiros.size(); i++){
            if(passageiros.get(i).getId() == num){
                return i;   
            }
        }
        return -1;
    }
    /**
     * Método para embarcar um passageiro
     * @param p passageiro que vai entrar no comboio
     */
    public void Embarcar(Passageiro p){
        if((passageiros.size() == capMax) || (getVelAtual() != 0)) return;
        else passageiros.add(p);
    }
    /**
     * Método para desembarcar um passageiro
     * @param num
     */
    public void Desembarcar(int num){
        if(getVelAtual() == 0 && find(num) != -1){
            passageiros.remove(find(num));
        }
    }
    /**
     * Método que retorna a receita total de todos os bilhetes
     * @return receita
     */
    public double getReceitaBilheteira(){
        double receita = 0;
        for(Passageiro p: passageiros){
            receita += price * (1 - (p.getdiscount()/100)); 
        }
        return receita;
    }
}

