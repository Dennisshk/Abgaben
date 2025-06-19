package worksheet8.task2;

public class Main {
    public static void main(String[] args){
        Student s = new Student("Mindesthaltbarkeitdatum",222,"backen");
        Student t = new Student("Maxesthaltbarkeitdatum",2282,"packen");

//        StudentFormattor s1 = new StudentFormattor() {
//            @Override
//            public String format(Student s) {
//                return "";
//            }
//        };
        StudentFormattor s1 = student->"Student"+ student.getName()+", Year"+student.getYear();
        StudentFormattor s2 = student-> {
            String st =student.getName()+" studies "+ student.getMajor()+" in Year "+student.getYear();
            return st;
        };
        //StudentFormattor s3 = student->System.out::print;

        System.out.println(s1.format(s)+"   "+s1.format(t));
        System.out.println(s2.format(s)+"   "+s2.format(t));
    }
}
