package src.June7HW;

import java.util.Arrays;

public class Angram {

    public static void main(String[] args) {


        String s1 = "players";
        String s2 = "parsley";

        if (s1.length() == s2.length()) {


            char[] characterArray1 = s1.toCharArray();
            char[] characterArray2 = s2.toCharArray();

            Arrays.sort(characterArray1);
            Arrays.sort(characterArray2);

            if (Arrays.equals(characterArray1, characterArray2)) {

                System.out.println("Both the strings are anagrams of each other");
            } else {
                System.out.println("Both the strings are not anagrams of each other");
            }
        } else {
            System.out.println("Both the strings are not anagrams of each other");
        }

    }
}
