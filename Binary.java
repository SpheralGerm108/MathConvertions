import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Binary {
    public static int convertB(int input){
        int output;
        output = input%2;

        if (input != 1) {
            input = input/2;
            convertB(input);
        } 

        System.out.print(output);
        return output;
    }

    public static double ConvertInt(String input){
        Pattern regex = Pattern.compile("[01]",Pattern.UNICODE_CHARACTER_CLASS);
        Matcher regexMatcher = regex.matcher(input);
        if (regexMatcher.find() == false) {
            System.out.println("\nERROR");
        }

        double decimal = 0;
        for(int i = input.length()-1; i >= 0; i--){
            StringBuilder reversed = new StringBuilder();
            reversed.append(input);
            reversed.reverse(); 
            int part = Integer.parseInt(String.valueOf(reversed.charAt(i)));
            decimal += part * Math.pow(2, i);
        }

        System.out.println(decimal);
        return decimal;
    }
}