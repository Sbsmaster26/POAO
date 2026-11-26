package Ficha11.Ex1;

import java.io.*;
import java.util.ArrayList;

public class ConsultaHorarios {
    public static void main(String[] args){
        ArrayList<String[]> comboios = new ArrayList<>();
        File f = new File("Comboios.txt");
        if (f.exists() && f.isFile()){
            try{
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while((line = br.readLine()) != null){
                    String[] array = line.split(";");
                    comboios.add(array);
                }
            }catch{
                
            }
        }
    
    }
}