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


    public void setSchedule(Schedule schedule){
        this.schedule= schedule ;
    }

    public boolean addStudent(Student student) {
        if (!isFull() && !enrolledStudents.contains(student)) {
            return enrolledStudents.add(student);
        }
        return false;  
    }

    public boolean removeStudent(Student student) {
        return enrolledStudents.remove(student);
    }

    public boolean isFull() {
        return enrolledStudents.size() >= maxCapacity;
    }

    public int getRemaingSeat(){
        return maxCapacity - enrolledStudents.size() ;
    }


}
