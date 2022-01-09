public class Main {
    public static void bul(String a) {
        for (int i = 0, j = a.length()-1; i < a.length(); i++,j--) {
            if (a.charAt(i)==a.charAt(j)) {
                System.out.print(" "+a.charAt(j));
            }
            System.out.print(" "+i);
        }
    }
    public static void main(String[] args) {
        bul("BilsayarliB");
    }
}
