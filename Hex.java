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
            
            int part = 0;
            switch (reverseString.charAt(i)) {
                case '0': part = 0; break;  
                case '1': part = 1; break; 
                case '2': part = 2; break; 
                case '3': part = 3; break; 
                case '4': part = 4; break; 
                case '5': part = 5; break; 
                case '6': part = 6; break; 
                case '7': part = 7; break; 
                case '8': part = 8; break; 
                case '9': part = 9; break; 
                case 'A': part = 10; break; 
                case 'B': part = 11; break; 
                case 'C': part = 12; break; 
                case 'D': part = 13; break; 
                case 'E': part = 14; break; 
                case 'F': part = 15; break; 
            }

            decimal += part * Math.pow(16, i); 
        }

        System.out.println(decimal);
        return decimal;
    }
}
