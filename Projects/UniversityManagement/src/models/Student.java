import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private String studentId ;
    private String  major ;
    private int    year;
    private  double gpa;
    private List<Course> enrolledCourse= new ArrayList<>();

    public Student(String studentId, String major, int year ){
        this.studentId= studentId ;
        this.major= major ;
        this.year = year ;
    }

    @Override
    public String getRole(){
        return "Student" ;
    }

    public  void enrollInCourse(Course course){
        enrolledCourse.add(course);
    }

}