package StringMethods;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        // String = a reference data type that can store one or more characters
        //          reference data type have access to useful methods

        String name = "Bro";

        boolean result = name.equals("Bro");
        System.out.println(result);

        boolean resultIgn = name.equalsIgnoreCase("bro");
        System.out.println(resultIgn);

        int resultLength = name.length();
        System.out.println(resultLength);

        char resultChar =  name.charAt(1);
        System.out.println(resultChar);

        int resultIndex = name.indexOf("o");
        System.out.println(resultIndex);

        boolean resultBoo = name.isEmpty();
        System.out.println(resultBoo);

        String resultUpper = name.toUpperCase(Locale.ROOT);
        System.out.println(resultUpper);

        String resultLower =  resultUpper.toLowerCase();
        System.out.println(resultLower);

        String surname = "      Monk    ";
        String resultTrim = surname.trim();
        System.out.println(resultTrim);

        String resultReplace = name.replace("B", "V");
        System.out.println(resultReplace);

    }
}
