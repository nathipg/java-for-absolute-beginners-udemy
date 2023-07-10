package unit12_oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp2 = new Employee();

        emp.name = "Joana";
        emp.age = 35;
        emp.jobTitle = "Supervisor";

        emp2.name = "Apollo";
        emp2.age = 70;
        emp2.jobTitle = "Security";

        bar(emp);

        Door door = new Door();

        door.printStatus();
        door.open();
        door.printStatus();

        // Array List
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);

        numbersList.remove(1);

        // Composition
        Course course = new Course("Computer Science", "lvl1", "09/07/2023");
        Student student = new Student("Pissuti", "11/05/1997", false);
        student.setCourse(course);

        System.out.println(student.getName() + " studies " + student.getCourse().getTitle());

        // Enum
        whichSeason(Month.JANUARY);
    }

    static void bar(Employee e) {
        System.out.println(e.name + " is " + e.jobTitle);
    }

    static void whichSeason(Month month) {
        switch (month) {
            case MARCH, APRIL, MAY:
                System.out.println("Spring");
                break;
            case JUNE, JULY, AUGUST:
                System.out.println("Summer");
                break;
            case SEPTEMBER, OCTOBER, NOVEMBER:
                System.out.println("Autumn");
                break;
            case DECEMBER, JANUARY, FEBRUARY:
                System.out.println("Winter");
                break;
        }
    }
}
