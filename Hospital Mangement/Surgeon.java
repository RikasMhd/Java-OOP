public class Surgeon extends Doctor{
    private String surgeryType;

    public Surgeon(String surgeryType,String name,String id,int age){
        super(name,id,age);
        this.surgeryType=surgeryType;
    }
    public String getSurgeryType(){
        return this.surgeryType;
    }
    @Override
    public String displayInfo(){
        return "Doctor Name is  "+super.getName()+"Age is "+super.getAge()+" and Id : "+super.getId()+".Surgery Type is "+getSurgeryType();
    }

}