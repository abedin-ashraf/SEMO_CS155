/*
    Java API has the GregorianCalendar class
    in the java.util package, which you can use to obtain the year, month, and day of a
    date. The no-arg constructor constructs an instance for the current date, and the methods
    get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
    and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
    Write a program to perform two tasks:
      Display the current year, month, and day.
      The GregorianCalendar class has the setTimeInMillis(long), which
    can be used to set a specified elapsed time since January 1, 1970. Set the value
    to 1234567898765L and display the year, month, and day.
*/

import java.util.GregorianCalendar;
public class Assignment905 {
    public static void main(String[] args) {

        GregorianCalendar calender = new GregorianCalendar();

        int currentYear = calender.get(GregorianCalendar.YEAR);
        int currentMonth = calender.get(GregorianCalendar.MONTH) + 1;
        int currentDay = calender.get(GregorianCalendar.DAY_OF_MONTH);

        // Printing current Year/month and day
        System.out.println("Before setting time: ");
        System.out.println("\tCurrent Year: " + currentYear);
        System.out.println("\tCurrent Month: " + currentMonth);
        System.out.println("\tCurrent Date: " + currentDay);

        // setting the Gregorian calendar time
        calender.setTimeInMillis(1234567898765L);
        System.out.println("\nAfter setting time: ");
        int nowYear = calender.get(GregorianCalendar.YEAR);
        int nowMonth = calender.get(GregorianCalendar.MONTH) + 1;
        int nowDay = calender.get(GregorianCalendar.DAY_OF_MONTH);

        // Printing current year/month and day
        System.out.println("\tNow Year: " + nowYear);
        System.out.println("\tNow Month: " + nowMonth);
        System.out.println("\tNow Date: " + nowDay);
        }
}
