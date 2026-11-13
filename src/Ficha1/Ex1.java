package Ficha1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        System.out.printf("\n");
        Scanner sc = new Scanner(System.in);
        
        double distancia_estacoes, vel_media, duracao;
        
        System.out.print("Distância entre estações(km): ");
        distancia_estacoes = sc.nextDouble();
        System.out.print("Velocidade media(km/h): ");
        vel_media = sc.nextDouble();
        
        duracao = (distancia_estacoes/vel_media) * 60;
        System.out.printf("A viagem irá durar %.0f minutos\n", duracao);
        
        int inicio = lerMinutos(sc, "INICIO");
        int fim = lerMinutos(sc, "FIM");
        double dif = fim-inicio;
        double desvio = abs(duracao - dif);
        System.out.printf("Desvio: %.1f minutos.", desvio);
        sc.close();
    }    
    private static double abs(double num){
        return (num < 0) ? num*-1 : num; 
    }
    private static int lerMinutos(Scanner sc, String titulo){
        System.out.printf("%s\n", titulo);
        System.out.print("Horas: ");
        int h = sc.nextInt() * 60;
        System.out.print("Minutos: ");
        int m = sc.nextInt();
        System.out.printf("\n");
    
        return h + m;
    }
}
