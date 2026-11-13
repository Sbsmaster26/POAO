package Aleatorios;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args){
        System.out.print("Escreva o número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int soma = 0, par = 0, impar = 0; 
        while(num > 0){
            if(num % 2 == 0){
                par += 1;
            }else{
                impar += 1;
            }
            soma += num % 10;
            num /= 10;
        }
        sc.close();
    double a = 2;
    double b = 2;

    String operation = "+";
    double value = switch (operation){
        case "+" -> a + b;
        case "-" -> a - b;
        case "*" -> a * b;
        case "/" -> {
            assert b != 0: "Division by zero";
            yield a/b;
        }
        default -> {
            assert false: "Unknown operation: " + operation;
            yield Double.NaN;
        }
    };
        System.out.printf("Soma dos dígitos = %d, %d pares e %d impares.\n", soma, par, impar);
        System.out.printf("Resultado da operation: %.2f.\n", value);
    }
}
