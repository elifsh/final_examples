import java.util.Scanner;
public class ch_num4 {
    public static String chNum_4(String[][]words) {
        String temp = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(words[i][j].length()==4) {
                    temp += words[i][j]+" ";
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] words = new String[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                words[i][j]=sc.next();
            }
        }
        sc.close();
        System.out.println(chNum_4(words));
    }
}
