package Menu;

import Patients.Dementi;
import Patients.Epileptic;
import Patients.Patient;
import Patients.Shizo;

import java.util.Random;
import java.util.Scanner;

public class CreateMenu {
    public static void call() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        String option;
        Random random = new Random();
        int age = 30;
        String name = "John";
        while (true){
            try{
                System.out.println("Enter name. Should be not empty.");
                name = s.nextLine();
                if (name.length() == 0){
                    System.out.println("Empty name is not allowed.");
                    throw new RuntimeException();
                }
                System.out.println("Enter age. Should be not empty.");
                age = s.nextInt();
                if (age > 100){
                    System.out.println("Why you drag corpse here?");
                    throw new RuntimeException();
                }
                if (age <= 10){
                    System.out.println("If your child peeing itself it's not the reason to bring him in asylum.");
                    throw new RuntimeException();
                }
                option = String.valueOf(random.nextInt(1, 3));
            }
            catch (RuntimeException exception){
                option = "wrong input";
            }

            switch (option){
                case "1": Patient.patients.add(new Shizo(name, age, random.nextInt(4, 8))); return;
                case "2": Patient.patients.add(new Dementi(name, age, random.nextInt(4, 8))); return;
                case "3": Patient.patients.add(new Epileptic(name, age, random.nextInt(4, 8))); return;
                case "4": return;
                default: System.out.println("Error. Try again."); break;
            }
        }

    }
}
