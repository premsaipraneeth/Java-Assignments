package src.June28HW;

import java.util.Optional;

public class Opt2 {
    public static Optional<String> convertToUppercase(Optional<String> inputOptional) {
        if (inputOptional.isPresent()) {
            String input = inputOptional.get();
            String uppercaseString = input.toUpperCase();
            return Optional.of(uppercaseString);
        } else {
            return Optional.empty();
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Optional<String> inputOptional = Optional.of("fc barcelona");
        Optional<String> resultOptional = Opt2.convertToUppercase(inputOptional);

        if (resultOptional.isPresent()) {
            String result = resultOptional.get();
            System.out.println("Uppercase string: " + result);
        } else {
            System.out.println("Input is empty.");
        }
    }
}
