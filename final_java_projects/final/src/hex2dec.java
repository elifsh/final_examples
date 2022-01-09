import java.util.Random;
public class hex2dec {
    public static int hex_to_decimal(String hexnum) {
        String digits = "0123456789ABCDEF";
        int value = 0;
        for (int i = 0; i < hexnum.length(); i++) {
            char ch = hexnum.charAt(i);
            int n = digits.indexOf(ch);
            value = value*16+n;
        }
        return value;
    }
    public static String hex_random() {
        Random r = new Random();
        String zeros = "00000";
        String s = Integer.toString(r.nextInt(0X100000), 16);
        s = zeros.substring(s.length()) + s;
        return s.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println("Hexadecimal number: " + hex_random());
        System.out.println("Hexadecimal number converted to decimal number: " + hex_to_decimal(hex_random()));
    }
}
