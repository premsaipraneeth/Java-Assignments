
package main.java.Day19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class WorkingDaysCalculator {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate lastDayOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());

        int workingDays = 0;
        LocalDate date = currentDate;
        while (date.isBefore(lastDayOfMonth)) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            date = date.plusDays(1);
        }

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }
}


