// 14. WAP to calculate an angle between hour and minute hand. (Hours and minutes should be
// taken from user).

import java.util.*;

class clockangle14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hour angle : ");
        int hourangle = sc.nextInt();
        System.out.println("Enter Minute angle : ");
        int minuteangle = sc.nextInt();

        int angle = (int) ((30 * hourangle) - (5.5 * minuteangle));

        System.out.println("Angle is - " + angle);
    }

}
