import java.util.*;

public class rangeprime_10 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter starting : ");
      int r1 = sc.nextInt();
      System.out.println("Enter Ending : ");
      int r2 = sc.nextInt();

      for (int i = r1; i <= r2; i++) {
         boolean isprime = true;
         for (int j = 2; j < i; j++) {
            if (i % j == 0) {
               isprime = false;
            }
         }

         if (isprime) {
            System.out.println(i);
         }
      }
   }
}