
import java.util.*;

class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.next();

        boolean ispalindrom = false;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1)) {
                ispalindrom = false;
            } else {
                ispalindrom = true;

            }
        }//for

        if (ispalindrom) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
