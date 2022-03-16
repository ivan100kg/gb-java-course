package Lessons.Lesson2;

public class Calendar {
    Month month = Month.JAN;

    public void currentDateInfo() {
        System.out.println(month.getNumber() + " " + month.name());
    }
}
