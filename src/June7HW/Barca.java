package src.June7HW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Barca implements Comparable<Barca> {

    String firstname;
    String lastname;

    double gpa;

    public Barca(String firstname, String lastname, double gpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
    }

    public String toString() {
        return "Barca{" + "firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", gpa=" + gpa + '}';
    }

    @Override

    public int compareTo(Barca that) {
        return this.lastname.compareTo(that.lastname);
    }
    public static void main(String[] args) {

        List<Barca> b = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kalip\\OneDrive\\Documents\\GitHub\\Java-Assignments\\src\\June7HW\\Barca.csv"))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] bar = line.split(",");
                String firstName = bar[0].trim();
                String lastName = bar[1].trim();
                double gpa = Double.parseDouble(bar[2].trim());

                Barca barca = new Barca(firstName, lastName, gpa);
                b.add(barca);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(b);
        for (Barca x : b)
            System.out.println(x.toString());

    }

}




