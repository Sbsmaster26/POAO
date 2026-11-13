package Aleatorios;

// import java.util.Scanner;


public class Strings {
    public static void main(String[] args){
        String address = """
            Departamento de Engenharia Informática
            Faculdade de Ciências e Tecnologia
            Universidade de Coimbra
            Pólo II- Pinhal de Marrocos
            3030-290 Coimbra
        """;
        String[] lines = address.split("\n");
        for(String line: lines)
            System.out.println(line);
    }
}