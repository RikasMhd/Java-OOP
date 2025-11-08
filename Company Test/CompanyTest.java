import java.util.*;

abstract class Employee {
    String name;
    Employee(String name) { 
        this.name = name; 
    }
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class Department{
    List<Employee>emp = new ArrayList<>();

    public void addEmployee(Employee e){
        emp.add(e);
    }
    public void showSalaries(){
        for(Employee e : emp){
            System.out.println("Name : "+e.name+" , "+"Earn : $"+e.calculateSalary());
        }
    }
}

class CompanyTest{
    public static void main(String[] args) {
        Department dep= new Department();
        dep.addEmployee(new FullTimeEmployee("Alice",15000));
        dep.addEmployee(new PartTimeEmployee("Bob",10, 1500));
        dep.showSalaries();
        
    }
}
