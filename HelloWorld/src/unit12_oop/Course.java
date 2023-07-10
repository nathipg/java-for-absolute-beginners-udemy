package unit12_oop;

public class Course {
    private String title;
    private String level;
    private String startDate;

    public Course(String title, String level, String startDate) {
        this.title = title;
        this.level = level;
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
