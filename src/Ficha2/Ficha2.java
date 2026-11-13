package Ficha2;

import java.util.Scanner;

public class Ficha2 {
    private static double calcularMedia(int[] array){
        double t = 0;
        for(int i=0; i<array.length; i++){
            t += 1.0/array[i];
        }
        return t;
    }
    public static void main(String[] args){
        int[] sensores = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < sensores.length; i++){
            System.out.print("Vel: ");
            sensores[i] = sc.nextInt();
        }
        double soma = calcularMedia(sensores);
        System.out.printf("Duração: %.2f min", soma*60);
        System.out.print("Deseja recalibrar algum sensor?(0-No/ 1-Yes): ");
        sc.close();
    }
}
