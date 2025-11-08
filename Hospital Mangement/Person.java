public abstract class Person{
    private String name,id;
    private int age;

    public Person(String name,String id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }
    abstract String displayInfo();
}