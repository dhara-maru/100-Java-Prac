//9. odd or even check without % operator
import java.util.Scanner;

public class OddEven9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if ((number & 1) == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

      
    }
}