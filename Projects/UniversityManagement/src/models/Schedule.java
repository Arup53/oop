public class Schedule {
    private String dayOfWeek ;
    private String startTime ;
    private String endTime ;
    private String room ;


    public Schedule(String dayOfWeek,String startTime,String endTime,String room ){
        this.dayOfWeek= dayOfWeek ;
        this.startTime= startTime ;
        this.endTime =endTime ;
        this.room = room ;
    }
}
