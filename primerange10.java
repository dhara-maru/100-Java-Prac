//10. prime numbers from a range 

import java.util.*;

class primerange10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int r1 = sc.nextInt();
        System.out.println("Enter Ending number: ");
        int r2 = sc.nextInt();

        for (int j = r1; j < r2; j++) {
            boolean isprime = true;
            for (int i = 2; i < j - 1; i++) {
                if (i % 2 == 0) {
                    isprime = false;
                } else {
                    isprime = true;
                }
            }//prime for	

            if (isprime) {
                System.out.println(j);
            }
        }//range for

    }

}
