// //12. WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
// should be taken from user (Note that you are not allowed to use an array for this)

import java.util.*;

class minmaxavg12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many values you want to enter ? - ");
        int num = sc.nextInt();

        System.out.println("ENter number 1 :");
        int n = sc.nextInt();
        int max = n;
        int min = n;
        int sum = n;

        for (int i = 2; i <= num; i++) {
            System.out.println("Enter number " + i + ":");
            n = sc.nextInt();

            if (n > max) {
                n = max;
            }
            if (n < min) {
                n = min;
            }

            sum = sum + n;
        }//end for

        double avg = (double) sum / n;

        System.out.println("Min - " + min);
        System.out.println("Max - " + max);
        System.out.println("Avg - " + avg);
    }
}
