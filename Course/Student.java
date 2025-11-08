import java.util.*;
public class Student {
    protected String name,registrationNum;
    List<Course>courses = new ArrayList<>();

    public Student(String name,String registrationNum){
        this.name=name;
        this.registrationNum=registrationNum;
    }
    public String getName(){
        return this.name;
    }
    public String getRegistrationNum(){
        return this.registrationNum;
    }
    public boolean addCourse(Course course){
        if(courses.size()<2){
            courses.add(course);
            return true;
        }
        else{
            System.out.println("Your Entrollment Courses More than 2 COurses.");
            return false;
        }
    }
    public void showCourses(){
        System.out.println("Name : "+getName()+" . Reg.No : "+getRegistrationNum());
        if(courses.isEmpty()){
            System.out.println("Entrollment yet.");

        }
        else{
            for(Course c : courses){
                System.out.println("Student Entrolled "+c);
            }
        }
    }
}
