package ua.dmytrokashchenko.consoleapp.service;

import java.util.regex.Pattern;

public class EmailValidatorService {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validateEmail(String email) {
        return EMAIL_PATTERN.matcher(email).find();
    }
}
