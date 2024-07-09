public class Hex {
    public static char ConvertH(int input){
        char output = 'a';
        int b = input%16;

        if (input > 16) {
            input = input/16;
            ConvertH(input);
        }

        System.out.print(output);
        return output;
    }


}
