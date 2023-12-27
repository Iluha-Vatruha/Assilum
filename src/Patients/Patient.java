package Patients;

import Illnesses.Ilness;


public abstract class Patient implements Ilness {
    protected boolean drugsTaken;
    protected String name;
    protected int age;
    protected int health;

    public Patient (String name, int age, int health){
        this.age = age;
        this.name = name;
        this.health = health;
    }

    @Override
    public String toString() {
        return " Patient " + "name: '" + name + '\'' + ", age: " + age + " health: " + health;
    }

    public boolean isDrugsTaken() {
        return drugsTaken;
    }

    public void setDrugsTaken(boolean drugsTaken) {
        this.drugsTaken = drugsTaken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
