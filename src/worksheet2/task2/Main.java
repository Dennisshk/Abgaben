package worksheet2.task2;

public class Main {
    public static void main(String[] args){
        //static = Message, dynamic = Email
        Message m1 = new Email ();
        //static = Message, dynamic = SMS
        Message m2 = new SMS ();

        //Methode EMail.getType() (dynamic)
        System.out. println (m1. getType ());
        //Methode SMS.getType() (dynamic)
        System.out. println (m2. getType ());

        //m1.send (); //Message hat kein send (static)
        if(m1 instanceof Email){
            ((Email)m1).send();
        }
        if(m2 instanceof Email){
            ((Email)m2).send();
        }
    }
}
