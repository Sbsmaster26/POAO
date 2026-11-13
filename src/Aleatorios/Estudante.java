package Aleatorios;

import java.util.Scanner;



public class Estudante implements Comparable<Estudante>{
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int[] notas;
    //Método para cálculo da média
    private float calculaMedia() {
        assert notas.length > 0: "Estudante sem notas";
        float soma = 0.f;
        for (int n: notas)
        soma += n;
        return soma / notas.length;
    }

    //Método de acesso externo à média
    public float getMedia() {
        return calculaMedia();
    }
    //Escreve os dados de um estudante
    public void imprimeEstudante() {
        System.out.print("As notas de " + nome + " são: ");
        for (int n: notas)
        System.out.print(n + " ");
        System.out.println();
        System.out.println("A média é " + calculaMedia());
    }

    public Estudante(String nome){
        this.nome = nome;
        System.out.print("Quantas notas? ");
        int numNotas = sc.nextInt();
        //Cria o vetor notas com a dimensão necessária
        notas = new int[numNotas];
        for (int i = 0; i < numNotas; i++) {
            System.out.print("Nota "+(i+1)+" deste aluno: ");
            notas[i] = sc.nextInt();
        }
    }

    public Estudante(String nome, int[] notasEst) {
        this(nome);
        // Cria um objeto nome com a string recebida
        //Cria o vetor notas com a dimensão necessária
        notas = new int[notasEst.length];
        System.arraycopy(notasEst, 0, notas, 0, notasEst.length);
    }
    
    public Estudante() {
        System.out.print("Nome do estudante: ");
        nome = sc.nextLine();
        System.out.print("Quantas notas? ");
        int numNotas = sc.nextInt();
        //Cria o vetor notas com a dimensão necessária
        notas = new int[numNotas];
        for (int i = 0; i < numNotas; i++) {
            System.out.print("Nota "+(i+1)+" deste aluno: ");
            notas[i] = sc.nextInt();
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        // int[] notas = {14, 17, 12, 10, 9};
        Estudante est = new Estudante("Joana");
        float media = est.getMedia();
        System.out.println("A média é " + media);
        est.imprimeEstudante();
    }
    @Override
    public int compareTo(Estudante e) {
        return Float.compare(e.getMedia(), getMedia());
    }
}
