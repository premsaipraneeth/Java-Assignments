package src.June7HW;

public class vowel {
    public static void main(String[] args) {
        String s = "Prem Sai Praneeth Kalipindi";
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                number++;
            }
        }
        System.out.println("Totel number of vowels in a given alphabet: " + number);
    }
}
