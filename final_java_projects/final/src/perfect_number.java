import java.util.Scanner;

public class perfect_number {
    public static int sum_NumberOfDivisors(int num) {
        int temp = 0;
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                temp += i ;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num == sum_NumberOfDivisors(num)) {
            System.out.println(num +"=="+sum_NumberOfDivisors(num));
            System.out.println("***Perfect Number***");
        }
        else {
            System.out.println(num +"!="+sum_NumberOfDivisors(num));
            System.out.println("!!!Not Perfect Number!!!");
        }
    }
}