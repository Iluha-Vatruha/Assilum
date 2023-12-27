package Patients;

import java.util.ArrayList;
import java.util.List;

public class Patients {
    private static Patients patients = new Patients();

    private List<Patient> list;

    public Patients() {
        list = new ArrayList<>();
    }

    public static Patients getPatients(){
        return patients;
    }

    public List<Patient> getList() {
        return list;
    }

    public void setList(List<Patient> list) {
        this.list = list;
    }
}
