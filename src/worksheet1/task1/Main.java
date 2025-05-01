package blatt1.aufgabe1;

public class Main {
    public static void main(String[] args){
        Book b = new Book("a",1,"b");
        Publication p = new Textbook("aqwwer", 1888,"Backpapier","Backpapier");

        System.out.print(b.getInfo());
        System.out.print(p.getInfo());
        Textbook t = (Textbook)p;
        t.setSubject("df");
    }
}
