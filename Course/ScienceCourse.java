public class ScienceCourse extends Course{
    public ScienceCourse(String course,String courseCode,int credit){
        super(course,courseCode,credit);
    }
    @Override
    public String toString(){
        return "Science Course";
    }
}
