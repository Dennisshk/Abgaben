package worksheet8.task2;

public class Student {
    private String name;
    private int year;
    private String major;

    public Student(String name, int year, String major) {
        this.name = name;
        this.year = year;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
