package Menu;

import Patients.Patient;
import Stuff.Doctor;

import java.util.Scanner;

public class InspectionMenu {
    public static void call() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        String option;
        int patientID = -1;

        while (true) {
            try{
                System.out.println("Choose option for this patient:");
                System.out.println("1. Give drugs.");
                System.out.println("2. Inspect.");
                System.out.println("3. Exit.");
                option = s.nextLine();

                switch (option) {
                    case "1": {
                        System.out.println("Input patients ID.");
                        patientID = Integer.valueOf(s.nextLine()) - 1;
                        if (patientID < 0 || patientID >= Patient.patients.size()){
                            throw new RuntimeException("Invalid id");
                        }
                        Doctor.getDoctor().giveDrugs(Patient.patients.get(patientID));
                    } break;
                    case "2": {
                        System.out.println("Input patients ID.");
                        patientID = Integer.valueOf(s.nextLine()) - 1;
                        if (patientID < 0 || patientID >= Patient.patients.size()){
                            throw new RuntimeException("Invalid id");
                        }
                        Patient.patients.get(patientID).invoke();
                    } break;
                    case "3": return;
                    default: System.out.println("Sir, you need to input number, not junks of bunks.");break;
                }

            }
            catch (RuntimeException exception){
                System.out.println(exception.getMessage());
                if (!(patientID < 0 || patientID >= Patient.patients.size())){
                    if (Patient.patients.get(patientID).health <= 0){
                        Patient.patients.remove(patientID);
                    }
                }
            } catch (Exception e) {
                System.out.println(
                        "Congratulations! " +
                                Patient.patients.get(patientID).name + " bit the doctor to death."
                        );
                System.exit(0);
            }

        }
    }
}
