import java.util.List;

public class Teacher extends Person {
    private String employeeId ;
    private String department ;
    private String rank ;
    // private List<Course> coursesTaught;
    
    public Teacher(String employeeId, String department, String rank){
        this.employeeId= employeeId ;
        this.department= department ;
        this.rank = rank;
    }

    @Override 
    public String getRole(){{
        return "Teacher";
    }}



}
