package Ficha11.Ex1;

import java.io.*;

public class ConsultaHorarios {
    public static void main(String[] args){
        File f = new File("Comboios.txt");
        if (f.exists() && f.isFile()){
            try{
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while((line = br.readLine()) != null){
                    line.split(";");
                }
            }catch{}
        }
    
    }
}
