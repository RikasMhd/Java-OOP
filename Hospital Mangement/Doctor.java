public class Doctor extends Person implements Schedulable{
    private String specializations;//(General Physician or Surgeon)

    public Doctor(String name,String id,int age,String specializations){
        super(name,id,age);
        this.specializations=specializations;
    }
    @Override
    public String displayInfo(){
        return "Doctor Name is  "+super.getName()+".\nAge is "+super.getAge()+".\nId is "+super.getId()+".\nSpecialized for "+this.specializations;
    }
    @Override
    public void schedule(String data){
        System.out.println("Scheduled Time is "+data);
    }
}