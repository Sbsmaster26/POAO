package Ficha3;

import java.util.Scanner;

public class Ex1_1{
    private static int digito(String s){
        int i = 0;
        for(int k=0; k<s.length(); k++){
            if(Character.isDigit(s.charAt(k))){ 
                i = 1;
            }
        }
        return i;
    }
    private static int letra(String s){
        int i = 0;
        for(int k=0; k<s.length(); k++){
            if(Character.isLetter(s.charAt(k))){ 
                i = 1;
            }
        }
        return i;
    } 
    private static String tipo(String s){
        if(!(s.equals("IC") || s.equals("R"))){
            System.out.println("Tipo de comboio invalido!");
            return s;
        }
        return switch (s){
            case "IC" -> "INTERCIDADES";
            case "R" -> "REGIONAL";
            default -> s;                  
        };
    }
    private static void imprime(String[] a){
        System.out.print("Código final: ");
        for(int i=0; i<a.length; i++){
            if(i<a.length-1){
                System.out.printf("%s-", a[i]);
            }else{
                System.out.printf("%s", a[i]);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j = 0;
        System.out.print("Código: ");
        String info = sc.nextLine();
        String[] tokens = info.split("-");
        for(int i=0; i<tokens.length; i++){
            tokens[i] = tokens[i].trim().toUpperCase();
            if(i==0){
                if(tokens[i] == tipo(tokens[i])){
                    sc.close();
                    return;
                }
                tokens[i] = tipo(tokens[i]);
            }
            if(tokens[i].length() == 0){
                System.out.println("Existe uma string vazia!");
                sc.close();
                return;
            }else{
                if(i != 3){
                    if(digito(tokens[i]) == 1){
                        System.out.printf("A %dª informação contém dígitos!", i+1);
                        sc.close();
                        return;
                    }
                }else{
                    if(letra(tokens[i]) == 1){
                        System.out.printf("A %dª informação contém letras!", i+1);
                        sc.close();
                        return;
                    }
                    if(tokens[i].length() != 3){
                        System.out.printf("A última informação contém %d digitos(deve ser formada apenas por 3 dígitos)!", tokens[i].length());
                        sc.close();
                        return;
                    }
                } 
                j++;
            }
        }
        if(j != 4){
            System.out.println("Faltam informações!");
            sc.close();
            return;
        }
        System.out.printf("O comboio %s número %s realiza uma viagem de %s para o %s.\n", tokens[0], tokens[3], tokens[1], tokens[2]);
        imprime(tokens);
        sc.close();
    }
}