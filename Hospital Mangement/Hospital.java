public class Hospital{
    public static void main(String [] args){
        Department dept=new Department();

        Patient p1=new Patient("Rikas","P1",23);
        Doctor d1=new Doctor("Nakeer","D1",50,"Surgeon");

        Patient p2=new Patient("Mayiz","P2",23);
        Doctor d2=new Doctor("mahriz","D2",50,"General Physician");

        
        dept.addDoctors(d1);
        dept.addPatients(p1);
        dept.addDoctors(d2);
        dept.addPatients(p2);
        System.out.println("Doctor's Details(Sureon):");
        dept.showDoctors();

        System.out.println("Patient's Details:");
        dept.showPatients();

        System.out.println("");
        dept.doctorToPatient(d1,p1);

        System.out.println("Doctors Dates & Times for Patients: ");
        p1.schedule("2025/10/03 at 10.00 A.M");
        p2.schedule("2025/10/03 at 10.00 A.M");

        System.out.println("");
        System.out.println("Bills For Patients: ");
        p1.generateBill(3840);
        p2.generateBill(2690);
        
    }
}