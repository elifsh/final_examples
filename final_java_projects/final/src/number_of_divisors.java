import java.util.Random;
public class number_of_divisors {
    public static String NumberOfDivisors(int num) {
        String temp = "";
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                temp += i + " ";
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;
        System.out.println(num);
        System.out.println(num + " of divisors " + NumberOfDivisors(num));
    }
}
