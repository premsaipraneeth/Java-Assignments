package main.java.Day19;

import java.time.LocalDate;
import java.time.Period;

//Write a program that calculates the age of a person given their birthdate using the Java 8 Date and Time API.
class CalculateAge{
    public static void main(String[] args){
        LocalDate currentDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of(1993, 11, 15);
        Period age = Period.between(birthdate, currentDate);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
    }
}
