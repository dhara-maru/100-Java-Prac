//8. find total odd and total even digits of given number

import java.util.*;

class countOddEven8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int oddcount = 0;
        int evencount = 0;
        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }

            n /= 10;
        }

        System.out.println("Even digits are : " + evencount);
        System.out.println("Odd digits are : " + oddcount);
    }
}
