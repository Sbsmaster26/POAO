package Ficha8;

public class Bilheteira {
    public void emitirBilhete(Passageiro p, double precoBase){
        System.out.println(p.toString()+"| Tarifa Base: "+precoBase+" -> Total a Pagar: "+ p.calcularPrecoBilhete(precoBase));
    }
}
