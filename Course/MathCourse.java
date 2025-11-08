public class MathCourse extends Course{
    public MathCourse(String course,String courseCode,int credit){
        super(course,courseCode,credit);
    }
    @Override
    public String toString(){
        return "Math Course";
    }
}
