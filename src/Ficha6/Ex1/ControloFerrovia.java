package Ficha6.Ex1;

/**
 * Classe que controla cada um dos comboios e passageiros[cite: 5]
 */
public class ControloFerrovia {

    public static void main(String[] args) {
        // 1. Definir estações e criar os dois comboios para a linha entre Coimbra e Figueira da Foz
        String origem = "Coimbra";
        String destino = "Figueira da Foz";

        // Comboio de passageiros: número 1, origem, destino, velocidade máxima (ex: 160.0), bilhete 25.0€, capacidade 200[cite: 4]
        ComboioPassageiros comboioPassageiros = new ComboioPassageiros(1, origem, destino, 160.0, 25.0, 200);

        // Comboio de mercadorias: número 2, origem, destino, velocidade máxima (ex: 120.0), carga máxima 800.0 t[cite: 3]
        ComboioMercadorias comboioMercadorias = new ComboioMercadorias(2, origem, destino, 120.0, 800);

        // 2. Criar e embarcar 2 passageiros no comboio de passageiros (um sem desconto, outro com 0.20 de desconto)
        Passageiro p1 = new Passageiro("Maria Silva", 101, 0.0);
        Passageiro p2 = new Passageiro("João Santos", 102, 0.20);

        comboioPassageiros.Embarcar(p1);
        comboioPassageiros.Embarcar(p2);

        // 3. Carregar 450.0 toneladas no comboio de mercadorias
        comboioMercadorias.carregar(450.0);

        // 4. Acelerar ambos os comboios para 100.0 km/h
        comboioPassageiros.acelerar(100.0);
        comboioMercadorias.acelerar(100.0);

        // 5. Apresentar no ecrã o estado de cada comboio e a receita obtida com a bilheteira
        System.out.println("=== ESTADO DO COMBOIO DE PASSAGEIROS ===");
        comboioPassageiros.info();
        comboioPassageiros.listarPassageiros();

        System.out.println("\n=== ESTADO DO COMBOIO DE MERCADORIAS ===");
        comboioMercadorias.info();
        comboioMercadorias.infMerc();

        System.out.println("\n=== RECEITA DA BILHETEIRA ===");
        System.out.println("Receita total: " + comboioPassageiros.getReceitaBilheteira() + " €");
    }
}


// public class ControloFerrovia {
//     // public static void main(String[] args){
//     //     ComboioPassageiros cp = new ComboioPassageiros(67, "Coimbra", "Lisboa", 120, 6.5, 20); 
//     //     ComboioMercadorias cm = new ComboioMercadorias(65, "Coimbra", "Lisboa", 120, 20);
//     //     Passageiro p1 = new Passageiro("Daniel", 67, 50);
//     //     Passageiro p2 = new Passageiro("Salvador", 7, 0);
//     //     cp.Embarcar(p1);
//     //     cp.Embarcar(p2);
//     //     cp.info();
//     //     System.out.println("Receita: " + cp.getReceitaBilheteira());
//     //     p1.inf();
//     //     p2.inf();
//     //     cp.acelerar(130);
//     //     cp.info();
//     //     cp.travar(23);
//     //     cp.info();
//     //     cm.carregar(3);
//     //     cm.info();
//     //     cm.acelerar(67);
//     //     cm.info();
//     //     cm.infMerc();
//     // }
// }
