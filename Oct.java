public class Oct {
    public static int ConvertH(int input){
        int output;
        output = input%8;

        if (input != 1) {
            input = input/8;
            ConvertH(input);
        }

        System.out.print(output);
        return output;
    }

    public static double ConvertInt(int input){
        int output = 0;
        return output;
    }
}
