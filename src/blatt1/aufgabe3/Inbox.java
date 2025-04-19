package blatt1.aufgabe3;

import java.util.ArrayList;

public class Inbox {
    private final ArrayList<Mail> mails = new ArrayList<>();

    public void addMail(Mail m){
        mails.add(m);
    }

    public void open(int index){
        if(mails.size()>index) System.out.println(mails.get(index).getMessage());
    }
    public void setRead(int index){
        if(mails.size()>index) mails.get(index).setRead();
    }


    public void printAllMails(){
        for (int i = 0; i<mails.size();i++){
            if(mails.get(i).isRead()){
                System.out.println((i+1)+": read | "+mails.get(i).getInfos());
            }else{
                System.out.println((i+1)+": not read | "+mails.get(i).getInfos());
            }

        }
    }

    public int countUnread(){
        int unread = 0;
        for(Mail i : mails){
            if(!i.isRead()) unread++;
        }
        return unread;
    }
}
