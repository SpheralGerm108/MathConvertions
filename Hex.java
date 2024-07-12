public class Hex {
    public static char ConvertH(int input){
        char blah = '#';
        int remainder = input%16;
        
        if (input > 16) {
            input = input/16;
            ConvertH(input);
        }

        switch (remainder) {
            case 0: blah = '0'; break;
            case 1: blah = '1'; break;
            case 2: blah = '2'; break;
            case 3: blah = '3'; break;
            case 4: blah = '4'; break;
            case 5: blah = '5'; break;
            case 6: blah = '6'; break;
            case 7: blah = '7'; break;
            case 8: blah = '8'; break;
            case 9: blah = '9'; break;
            case 10: blah  = 'A'; break;
            case 11: blah  = 'B'; break;
            case 12: blah  = 'C'; break;
            case 13: blah  = 'D'; break;
            case 14: blah  = 'E'; break;
            case 15: blah  = 'F'; break;
        }

        System.out.print(blah);
        return blah;
    }

    public static double ConvertInt(String input){

        double decimal = 0;
        for(int i = input.length()-1; i>= 0; i--){
            StringBuilder reverseString = new StringBuilder();
            reverseString.append(input);
            reverseString.reverse(); 
            
            switch (input.charAt(i)) {
                case 1: 
                    
                    break;
            
            }
        }

        return decimal;
    }
}
