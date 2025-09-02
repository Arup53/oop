

import models.Course;
import models.Student;
import services.CourseService;
import services.EnrollmentService;
import services.StudentService;

public class Main {
    private static StudentService studentService= new StudentService() ;
    private  static CourseService courseService = new CourseService();
    private  static EnrollmentService enrollmentService = new EnrollmentService(studentService, courseService);

    
    public static void main(String[] args) {
       Student mike= new Student("1", "CS", 1);
       Course cs101= new Course("101", "CS_FUNDAMENTAL", null, 3, 100);

       studentService.addStudentToSystem(mike);
       courseService.addCourse(cs101);

       boolean isSuccess = enrollmentService.enrollStudentInCourse("1", "101");
       System.out.println(isSuccess);
    }
}

