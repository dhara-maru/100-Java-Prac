
import java.util.*;

class DigitSum5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // // Extract the last digit and add to sum
            n /= 10;// Remove the last digit
        }
        System.out.println("sum is : " + sum);
    }
}
