
public class Age {

    public void Person(int age) {
        if (age >= 13 && age <= 19) {
            System.out.println("Person is a teen");
        } else if (age < 13) {
            System.out.println("Person is a Kid");
        } else if (age > 19) {
            System.out.println("Person is an adult");
        }

    }
}
