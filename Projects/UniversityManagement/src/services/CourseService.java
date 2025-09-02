package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Course;

public class CourseService {
    private List<Course> courses ;
    private Map<String, Course> courseIndex ;

    public CourseService(){
        this.courses= new ArrayList<>() ;
        this.courseIndex = new HashMap<>();
    }

    // implement crud on courses model with valiadation ; a middle layer for calling the methods of course  class
    public boolean AddCourse(Course course){
        if(course == null || course.getCourseId()== null) {
            throw new IllegalArgumentException("Course and course id can't be null");
        }

        if(courseIndex.containsKey(course.getCourseId())){
            return false ;
        }

        courses.add(course);
        courseIndex.put(course.getCourseId(), course);
        return true ;
    }

}
