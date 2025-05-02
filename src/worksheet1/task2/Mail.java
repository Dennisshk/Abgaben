package worksheet1.task2;

import java.time.LocalDateTime;

public class Mail {
    private final String sender;
    private final String subject;
    private final String message;
    private LocalDateTime datetime;
    private boolean read;

    public Mail(String sender, String subject, String message) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        datetime=LocalDateTime.now();
        read = false;
    }

    public String getInfos(){
        return subject +" | "+ sender +" | "+ datetime.getHour()+":"+datetime.getMinute()+"|"+datetime.getDayOfMonth()+"."+datetime.getMonthValue()+"."+datetime.getYear();
    }
    public String getMessage() {
        return subject +" from "+ sender +" on "+ datetime.getHour()+":"+datetime.getMinute()+"|"+datetime.getDayOfMonth()+"."+datetime.getMonthValue()+"."+datetime.getYear() +": " +message;
    }

    public boolean isRead(){
        return read;
    }
    public void setRead(){
        read = true;
    }
}
