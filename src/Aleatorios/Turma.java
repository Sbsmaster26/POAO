package Aleatorios;
import java.util.Scanner;


class Turma {
    public static void main(String[] args) {
        Turma turma = new Turma(); // Cria uma turma
        Scanner stdin = new Scanner(System.in);
        int escolha;
        do {// Menu
            System.out.println("1- Inscrever estudante");
            System.out.println("2- Ordenar estudantes");
            System.out.println("3– Listar estudantes");
            System.out.println("0- Sair");
            escolha = stdin.nextInt();
            switch (escolha) {
                // case 1-> turma.inscreve();
                // case 2-> turma.ordena();
                // case 3-> turma.imprime();
                case 0-> {}
            }
        } while (escolha != 0);
        stdin.close();
    }
}