package worksheet8.task1;

public enum CoursePhase {

    NOT_STARTED("Course not started yet"),
    ONGOING("Course is in progress"),
    FINISHED("Course has ended");

    CoursePhase(String message){
        this.message=message;
    }

    private final String message;

    public String getMessage(){
        return message;
    }

}
