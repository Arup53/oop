import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId ;
    private String courseName ;
    private String description ;
    private int credits ;
    private int maxCapacity ;
    private Teacher teacher ;
    private List<Student> enrolledStudents = new ArrayList<>() ;
    private Schedule schedule ;

    public Course(String courseId, String courseName, String description, int credits, int maxCapacity){
        this.courseId= courseId ;
        this.courseName = courseName ;
        this.description = description ;
        this.credits = credits ;
        this.maxCapacity = maxCapacity ;
    }


    public void assignTeacher(Teacher teacher){
        this.teacher= teacher ;
    }

    public void assignSchedule(Schedule schedule){
        this.schedule= schedule ;
    }

    public String addStudent(Student student){
        if(enrolledStudents.size() <= maxCapacity){
          enrolledStudents.add(student);
          return "Enrollement successful" ;
        }else {
            return "Course is at max capacity";
        }
    }

    public int getAvaliableSpot(){
        return maxCapacity - enrolledStudents.size() ;
    }



}
