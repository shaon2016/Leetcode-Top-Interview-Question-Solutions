package other;

import java.util.HashSet;
import java.util.Set;

public class RemoveRepetitions {
    public static String transform(String input) {
        if (input.length() <= 1)
            return input;
        if (input.charAt(0) == input.charAt(1))
            return transform(input.substring(1));
        else
            return input.charAt(0) + transform(input.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(RemoveRepetitions.transform("abbcbbb"));
    }
}