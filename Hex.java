public class Hex {
    public static char ConvertH(int input){
        char blah = '#';
        int remainder = input%16;
        
        switch (remainder) {
            case 0: blah = '0';
            case 1: blah = '1';
            case 2: blah = '2';
            case 3: blah = '3';
            case 4: blah = '4';
            case 5: blah = '5';
            case 6: blah = '6';
            case 7: blah = '7';
            case 8: blah = '8';
            case 9: blah = '9';
            case 10: blah  = 'A';    
            case 11: blah  = 'B';
            case 12: blah  = 'C';
            case 13: blah  = 'D';
            case 14: blah  = 'E';
            case 15: blah  = 'F';
            // default: blah = '#';
        }

        if (input > 16) {
            input = input/16;
            ConvertH(input);
        }

        System.out.print(blah);
        return blah;
    }


}
