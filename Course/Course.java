public class Course {
    protected String course,courseCode;
    protected int credit;

    public Course(String course,String courseCode,int credit){
        this.course=course;
        this.courseCode=courseCode;
        this.credit=credit;
    }
    public String getCourse(){
        return this.course;
    }
    public String getCourseCode(){
        return this.courseCode;
    }
    public int getCredit(){
        return this.credit;
    }
    @Override
    public String toString(){
        return "Course : "+getCourse()+" . Course Code is "+getCourseCode();
    }

}
