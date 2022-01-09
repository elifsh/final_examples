import java.util.Random;

public class equ_str {
    public static String equChar(String str, String str1) {
        String temp = "";
        for (int i = 0; i < Math.min(str.length(), str.length()); i++) {
            if (str.charAt(i) == str1.charAt(i)) {
                temp += str.charAt(i) + " | ";
            }
        }
        return temp;
    }
    public static String str_random() {
        // create a string of uppercase and lowercase characters and numbers
    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";

    // combine all strings
    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

    // create random string builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    // specify length of random string
    int length = 6;

    for(int i = 0; i < length; i++) {

      // generate random index number
      int index = random.nextInt(alphaNumeric.length());

      // get character specified by index
      // from the string
      char randomChar = alphaNumeric.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }

    String randomString = sb.toString();
    return randomString;
    }
    public static void main(String[] args) {
        String str = "Taner";
        String str1 = "tamer";
        System.out.println(equChar(str, str1));
    }
}
