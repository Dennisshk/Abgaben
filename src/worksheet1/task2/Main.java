package worksheet1.task2;

public class Main {
    public static void main(String[] args){
        Inbox in = new Inbox();
        Mail a= new Mail("Backpapier","kein Backpapier mehr", "Gib mir mehr Backpapier");
        in.addMail(a);
        in.addMail(new Mail("a","Haftpflichtversicherung", "meine Haftpflichtversiceherung ist abgelaufen"));

        System.out.println("Unread: "+in.countUnread());
        in.printAllMails();
        in.open(2);
        in.open(0);
        in.setRead(0);
        System.out.println(in.countUnread());
        in.printAllMails();
    }
}
