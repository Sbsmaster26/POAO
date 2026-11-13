package Aleatorios;

import java.util.ArrayList;
import java.util.List;

public class Mensagens {
    public static void main(String[] args){
        List<Pensamento> list = new ArrayList<>();
        list.add(new Conselho());
        list.add(new Pensamento());
        list.add(new Conselho());
        for(Pensamento p: list){
            p.mensagem();
        }
    }    
}
