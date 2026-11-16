package Aleatorios;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private int age;
    private int cc;
    public Person(String name, int age, int cc) {
        this.name = name;
        this.age = age;
        this.cc = cc;
    }
    public String toString(){
        return "Pessoa " + name + " com idade " + age + " e CC " + cc;
    }
}
