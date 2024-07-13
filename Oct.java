public class Oct {
    public static int ConvertO(int input){
        int output = input%8;

        if (input > 8) {
            input = input/8;
            ConvertO(input);
        }

        System.out.print(output);
        return output;
    }

    public static double ConvertInt(int input){
        String inputString = String.valueOf(input);

        double decimal = 0;
        for(int i = inputString.length()-1; i >= 0; i--){
            StringBuilder reverseString = new StringBuilder();
            reverseString.append(input);
            reverseString.reverse(); 
            int part = Integer.parseInt(String.valueOf(reverseString.charAt(i)));
            decimal += part * Math.pow(8, i);
        }

        System.out.println(decimal);
        return decimal;
    }
}
