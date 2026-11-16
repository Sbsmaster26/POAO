package Aleatorios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheiro{
    public static void main(String[] args){
        File f = new File("ficheiro.txt");
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Ola");
            bw.newLine();
            bw.write("mundo!");
            bw.close();
        }catch(IOException ex){
            System.out.println("Erro a escrever no ficheiro.");
        }
    }
}
