//7. fibonacci series

import java.util.*;

class fibonacci7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        System.out.println("Fibonacci series: ");

        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
