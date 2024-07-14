import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;


public class Binary {
    public static int convertB(int input){
        int output = input%2;

        ArrayList<String> baba = new ArrayList<String>();
        baba.add(String.valueOf(output));


        if (input != 1) {
            input = input/2;
            convertB(input);
        } 

        //////////////
        
        
        
        StringBuilder sb = new StringBuilder();

        for(String b : baba){
            sb.append(String.valueOf(output));
        }
        String result = sb.toString();
        System.out.println(result);
        

        ///////////////////

        // System.out.print(output);
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