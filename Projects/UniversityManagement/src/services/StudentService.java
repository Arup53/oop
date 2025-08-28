package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import models.Student;

public class StudentService {
    private List<Student> students;
    private Map<String, Student> studentIndex;


    public StudentService(){
        this.students = new ArrayList<>();
        this.studentIndex = new HashMap<>() ;
    }


    // add student to system

    public Boolean addStudentToSystem(Student student){
        
        if(student ==null || student.getStudentId() == null){
            throw new IllegalArgumentException("Student and student ID cannot be null");
        }

        if(studentIndex.containsKey(student.getStudentId())){
            return false ;
        }

        students.add(student);
        studentIndex.put(student.getStudentId(), student);
        return true ;
    }

    public Student findStudentById(String studentId) {
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be null or empty");
        }

        Student student = studentIndex.get(studentId);
        if (student == null) {
            throw new NoSuchElementException("Student with ID " + studentId + " not found");
        }
        return student;
    }

}
