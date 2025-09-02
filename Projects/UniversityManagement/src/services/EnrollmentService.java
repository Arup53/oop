package services;

import models.Course;
import models.Student;

public class EnrollmentService {
    
    private StudentService studentService ;
    private CourseService courseService ;

    public EnrollmentService(StudentService studentService, CourseService courseService){
        this.studentService= studentService ;
        this.courseService = courseService ;
    }

    public boolean enrollStudentInCourse(String studentId, String courseId){
        if(studentId == null || studentId.trim().isEmpty() || courseId == null || courseId.trim().isEmpty()){
            throw new IllegalArgumentException("studentid or courseId can not be null");
        }
        Student student = studentService.findStudentById(studentId);
        Course  course  = courseService.findCourseById(courseId);

        student.addCourse(course);
        course.addStudent(student);

        return true ;
    }
}
