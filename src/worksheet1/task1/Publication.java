package blatt1.aufgabe1;

public class Publication {
    private String title;
    private int year;

    public Publication(String title, int year){
        this.title = title;
        this.year = year;
    }

    public String getInfo(){
        return "Titel: "+title+"; Jahr: "+year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
