package Ficha5.Ex1;
import java.util.ArrayList;
// import java.util.Scanner;

public class Comboio{
    private int num;
    private String origem;
    private String destino;
    private int capMax;
    private int velAtual = 0;
    private ArrayList<Passageiro> passageiros;
    public Comboio(int num, String origem, String destino, int capMax){
        passageiros = new ArrayList<Passageiro>();
        this.num = num;
        this.origem = origem;
        this.destino = destino;
        this.capMax = capMax;
    }
    private int find(int num){
        for(int i=0; i<passageiros.size(); i++){
            if(passageiros.get(i).getId() == num){
                return i;   
            }
        }
        return -1;
    }
    public void Embarcar(Passageiro p){
        if((passageiros.size() == capMax) || (velAtual != 0)) return;
        else passageiros.add(p);
    }
    public void Desembarcar(int num){
        if(velAtual == 0 && find(num) != -1){
            passageiros.remove(find(num));
        }
    }
    public void Procurar(int num){
        Passageiro p = passageiros.get(find(num));
        System.out.printf("Nome: %s; Número: %d", p.getId(), p.toString());
    }
    public void listarPassageiros(){
        for(int i=0; i<passageiros.size(); i++){
            System.out.printf("Nome: %s; Número: %d",passageiros.get(i).toString(), passageiros.get(i).getId()); 
        }
    }
    public void alterarVelocidade(int v){
        if(v >= 0 && v <=200){
            velAtual = v;
        }
    }
    public void infComboio(){
        System.out.printf("O comboio %d tem origem em %s com destino a %s, tem %d lugares disponíveis e viaja a uma velocidade de %dkm/h.", num, origem, destino, capMax-passageiros.size(), velAtual);
    }
}
