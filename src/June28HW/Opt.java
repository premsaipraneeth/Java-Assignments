package src.June28HW;

import java.util.Optional;

class StringUtils {
    public static Optional<Integer> getStringLength(String value) {
        if (value == null) {
            return Optional.empty();
        } else {
            return Optional.ofNullable(value.length());
        }
    }
}

public class Opt{
    public static void main(String[] args) {
        String value = "FC Barcelona";
        Optional<Integer> optionalObject = StringUtils.getStringLength(value);

        if (optionalObject.isPresent()) {
            System.out.println("Length of the string: " + optionalObject.get());
        } else {
            System.out.println("value string is null.");
        }
    }
}
