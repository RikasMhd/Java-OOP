public class Patient extends Person implements Schedulable,Payable{
    public Patient(String name,String id,int age){
        super(name,id,age);
    }
    @Override
    public String displayInfo(){
        return "Patient Name is  "+super.getName()+"\nAge is "+super.getAge()+".\nId is "+super.getId();
    }
    @Override
    public void schedule(String data){
        System.out.println(super.getName()+"'s Scheduled Time is on "+data);
    }
    @Override
    public void generateBill(double amount){
        System.out.println(super.getName()+"'s Total Amount is $ "+amount);
    }
}