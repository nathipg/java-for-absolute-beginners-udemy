package unit12_oop;

public class Student {
    private String name;
    private String dateOfBirth;
    private boolean hasStudentHousing;
    private Course course;

    public Student(String name, String dateOfBirth, boolean hasStudentHousing) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.hasStudentHousing = hasStudentHousing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean hasStudentHousing() {
        return hasStudentHousing;
    }

    public void setHasStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
