package Patients;

import Illnesses.Ilness;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient implements Ilness {
    public static List <Patient> patients = new ArrayList<>();
    public boolean drugsTaken;
    public String name;
    public int age;
    public int health;
    public Patient (String name, int age, int health){
        this.age = age;
        this.name = name;
        this.health = health;
    }

    @Override
    public String toString() {
        return " Patient " + "name: '" + name + '\'' + ", age: " + age + " health: " + health;
    }
}
