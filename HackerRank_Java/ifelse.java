
import java.util.*;




public class ifelse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {

            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}
