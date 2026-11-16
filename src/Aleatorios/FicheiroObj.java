package Aleatorios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FicheiroObj {
    public static void main(String[] args){
        File f = new File("ficheiro.obj");
        Person person = new Person("Daniel", 30, 111223212);
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro a criar ficheiro.");
        } catch (IOException ex) {
            System.out.println("Erro a escrever para o ficheiro.");
        }
        try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person1 = (Person)ois.readObject();
            System.out.println(person1);
            ois.close();
        }catch (FileNotFoundException ex) {
            System.out.println("Erro a abrir ficheiro.");
        }catch (IOException ex) {
            System.out.println("Erro a ler ficheiro.");
        }catch (ClassNotFoundException ex) {
            System.out.println("Erro a converter objeto.");
        }
    }
}