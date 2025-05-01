package blatt1.aufgabe3;

public class Main {
    public static void main(String[] args){
        Inbox in = new Inbox();
        Mail a= new Mail("Backpapier","kein Backpapier mehr", "Gib mir mehr Backpapier", "00:01");
        in.addMail(a);
        in.addMail(new Mail("a","Haftpflichtversicherung", "meine Haftpflichtversiceherung ist abgelaufen", "00:03"));

        System.out.println("Unread: "+in.countUnread());
        in.printAllMails();
        in.open(2);
        in.open(0);
        in.setRead(0);
        System.out.println(in.countUnread());
        in.printAllMails();
    }
}
