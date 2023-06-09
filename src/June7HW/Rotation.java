package src.June7HW;

public class Rotation {

    static boolean Rotate(String s1, String s2) {

        String s3 = s1 + s2;

        return s1.length() == s2.length() && ((s3).contains(s2));
    }

    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        if (Rotate(str1, str2)) {
            System.out.println("Given strings are rotations of each other");
        } else {
            System.out.println("Given strings are not rotations of each other");
        }

    }
}
