import java.util.*;
public class Department{
    ArrayList<Doctor>doctors = new ArrayList<>();
    ArrayList<Patient>patients = new ArrayList<>();

    public void addDoctors(Doctor d){
        doctors.add(d);
    }
    public void addPatients(Patient p){
        patients.add(p);
    }
    public void showDoctors(){
        for(Doctor d:doctors){
            System.out.println(d.displayInfo());
            System.out.println("");
        }
    }
    public void showPatients(){
        for(Patient p:patients){
            System.out.println(p.displayInfo());
            System.out.println("");
        }
    }
    public void doctorToPatient(Doctor doctor,Patient patient){
        System.out.println("Doctor is "+doctor.getName()+" & Patient is "+patient.getName());
    }
} 