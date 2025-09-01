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

   

}
