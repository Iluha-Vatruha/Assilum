package Stuff;

import Patients.Patient;

import javax.print.Doc;

public class Doctor {
    private static final Doctor doctor = new Doctor();
    public int age;
    public String name;
    public int health;
    private Doctor(){
        age = 40;
        name = "Livsey";
        health = 20;
    }
    public static Doctor getDoctor(){
        return doctor;
    }
    public void giveDrugs(Patient patient){
        if (patient.drugsTaken){
            System.out.println("Doctor says: You already got your pills. Go to your cell.");
            return;
        }
        patient.drugsTaken = true;
    }
}
