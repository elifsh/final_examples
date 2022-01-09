public class work {
    static int tempT = 0;
    public static int sum_workTime(int time, int i) {
        if (i == 30) {
            return tempT;
        } else if (i == 6 || i == 7 || i == 13 || i == 14 || i == 20 || i == 21 || i == 27 || i == 28) {
            return sum_workTime(time, i+1);      
        } else {
            tempT += time;
            time +=2 ;
            System.out.println(" " +tempT);
            System.out.println("-" + i);
            return sum_workTime(time, i+1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum_workTime(30, 1));
    }
}
