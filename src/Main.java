import Menu.MainMenu;
import Patients.Dementi;
import Patients.Epileptic;
import Patients.Patient;
import Patients.Shizo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Patient.patients.add(new Shizo("Zina", 62, 6));
        Patient.patients.add(new Dementi("Sergei", 75, 5));
        Patient.patients.add(new Epileptic("Kesha", 34, 8));
        MainMenu.call();
    }
}