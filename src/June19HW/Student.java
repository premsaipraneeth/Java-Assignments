package src.June19HW;

import java.util.ArrayList;
import java.util.List;

class Students{
    String firstName;
    String lastName;

    double GPA;

    public Students(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

public class Student {
    public static void main(String[] args) {

        List<Students> li = new ArrayList<>();
        li.add(new Students("Leo","Messi",4.0));
        li.add(new Students("Robert","Lewandowski",3.8));
        li.add(new Students("Sergi","Roberto",3.0));
        li.add(new Students("Eric","Garcia",3.1));
        li.add(new Students("Sergio","Busquets",3.4));
        li.add(new Students("Ronald","Araujo",3.6));

        double totalGPA = 0;

        for (Students d: li) {

            totalGPA+= d.getGPA();

        }

        double avgGPA = totalGPA/li.size();

        ArrayList<Students> li2 = new ArrayList<>();
        for (Students s:li){
            if(s.getGPA()<avgGPA){
                li2.add(s);
            }
        }

        for(Students f: li2){
            System.out.println(f);
        }

    }
}
