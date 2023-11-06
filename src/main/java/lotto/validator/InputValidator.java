package lotto.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {

    private static final String INTEGER_PATTERN = "-?[0-9]+";
    private static final Pattern INTEGER_REGEX = Pattern.compile(INTEGER_PATTERN);

    public void isNotBlank(String input) {
        if(input.isBlank()) throw new IllegalArgumentException("");
    }

    public void isNotDist(String input) {
        Matcher matcher = INTEGER_REGEX.matcher(input);
        if(!matcher.matches()) throw new IllegalArgumentException("");
    }
}
