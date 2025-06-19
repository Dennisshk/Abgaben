package worksheet8.task1;

public class Main {
    public static void main(String[] args){
        CoursePhase c1 = CoursePhase.ONGOING;
        CoursePhase c2 = CoursePhase.valueOf("ONGOING");
        CoursePhase c3 = CoursePhase.NOT_STARTED;
        CoursePhase c4 = CoursePhase.NOT_STARTED;
        CoursePhase c5 = CoursePhase.FINISHED;

        //Alle 3 Konstanten aus CoursePhase
        CoursePhase[] phasen = CoursePhase.values();

        switch (c1){
            case CoursePhase.ONGOING:
                System.out.println(c1.getMessage());
            case CoursePhase.FINISHED:
                System.out.println(c1.getMessage());
            default:
                System.out.println(c1.getMessage());
        }
    }
}
