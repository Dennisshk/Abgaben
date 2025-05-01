package worksheet1.task2;

public class Mail {
    private final String sender;
    private final String subject;
    private final String message;
    private final String datetime;
    private boolean read;

    public Mail(String sender, String subject, String message, String datetime) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        read = false;
    }

    public String getInfos(){
        return subject +" | "+ sender +" | "+ datetime;
    }
    public String getMessage() {
        return subject +" from "+ sender +" on "+ datetime +": " +message;
    }

    public boolean isRead(){
        return read;
    }
    public void setRead(){
        read = true;
    }
}
