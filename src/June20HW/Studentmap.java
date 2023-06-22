package src.June20HW;

import java.util.HashMap;
import java.util.Iterator;

class Student {
    String firstName;
    String lastName;

    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

public class Studentmap {
    public static void main(String[] args) {

        HashMap<String, Student> h = new HashMap<>();
        h.put("One", new Student("Leo", "Messi", 4.0));
        h.put("Two", new Student("Sergio", "Busquets", 3.6));
        h.put("Three", new Student("Xavi", "Hernandez", 3.8));
        h.put("Four", new Student("Andres", "Iniesta", 3.8));
        h.put("Five", new Student("Pep", "Guardiola", 3.9));

        System.out.println(h.entrySet());

        System.out.println("                         ");

        h.forEach((key, student) -> System.out.println("Key:" + key + ", " + "Value: " + student.getFirstName() + "  " + student.getLastName() + "   " + student.getGPA()));

        System.out.println("                         ");

        Iterator<String> i = h.keySet().iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println("Key: " + s + ",  Value: " + h.get(s));
        }
    }
}
