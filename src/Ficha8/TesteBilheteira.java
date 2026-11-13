package Ficha8;

public class TesteBilheteira {
    public static void main(String[] args) {
        PassageiroComPasse p1 = new PassageiroComPasse("Salvador Simões", 123, "PASSE COIMBRA-MOVE-TE");
        PassageiroIdoso p2 = new PassageiroIdoso("Daniel Cintrão", 234, 68);
        Passageiro p3 = new Passageiro("Salvador Cintrão", 111);
        Bilheteira b = new Bilheteira();
        b.emitirBilhete(p1, 12.50);
        b.emitirBilhete(p2, 12.50);
        b.emitirBilhete(p3, 12.50);
    }
}
