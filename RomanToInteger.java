import java.util.Arrays;

public class RomanToInteger {
    public int romanReturn(char x) {
        switch (x) {
            case 'I': 
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public int[] romanArrange(char[] chars) {
        int[] roman = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            roman[i] = romanReturn(chars[i]);
        }
        return roman;
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int[] roman = romanArrange(chars);
        int ans = 0;
        int prev = 0;

        for (int i = (roman.length - 1); i >= 0; i--) {
            if (roman[i] < prev){
                ans -= roman[i];
            } else{
                ans += roman[i];
            }
            prev = roman[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        
        String roman = "MCLXXX";

        System.out.println(obj.romanToInt(roman.toUpperCase()));
    }
}
