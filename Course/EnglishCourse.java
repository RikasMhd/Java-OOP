public class EnglishCourse extends Course{
    public EnglishCourse(String course,String courseCode,int credit){
        super(course,courseCode,credit);
    }
    @Override
    public String toString(){
        return "English Course";
    }
}
