package Ficha5.Ex1;

public class GestaoCoimbra {
    public static void main(){
        Comboio c1 = new Comboio(67, "Coimbra", "Lisboa", 5);
        Passageiro p1 = new Passageiro("Salvador", 123);
        Passageiro p2 = new Passageiro("Salvador", 123);
        c1.Embarcar(p1);
        c1.Embarcar(p2);
        c1.alterarVelocidade(67);
        c1.infComboio();
    }
}
