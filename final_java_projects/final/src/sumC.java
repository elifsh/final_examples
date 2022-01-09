import java.util.Random;
public class sumC {
    public static double sum_of_circle_areas(int N, int firstR) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(firstR, 2)*Math.PI;
            firstR /=2;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Random r = new Random();
        int firstR = r.nextInt(100)+1;
        int N = r.nextInt(10)+1;
        System.out.println(N);
        System.out.println(firstR);
        System.out.println(sum_of_circle_areas(N, firstR));
    }
}
