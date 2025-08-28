package models;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private String studentId ;
    private String  major ;
    private int    year;
    private  double gpa;
    private List<Course> enrolledCourses= new ArrayList<>();

    public Student(String studentId, String major, int year ){
        this.studentId= studentId ;
        this.major= major ;
        this.year = year ;
    }

    @Override
    public String getRole(){
        return "Student" ;
    }

    public void addCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    public void removeCourse(Course course) {
        enrolledCourses.remove(course);
    }
    
    public String getStudentId(){
        return studentId ;
    }
    
    
    public List<Course> getEnrolledCourses() {
            return new ArrayList<>(enrolledCourses); // Return copy for encapsulation
        }
 

}