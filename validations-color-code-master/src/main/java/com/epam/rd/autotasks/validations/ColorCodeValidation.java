package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        // Put your code here
        String regexp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

        Pattern pattern = Pattern.compile(regexp);

        if(color == null) {
            return false;
        }

        Matcher m = pattern.matcher(color);
        return m.matches();
    }
}





