package DSA;

import java.util.Scanner;

public class DayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N-th day");
        int n = sc.nextInt();
       
        System.out.println("Enter Todays day");
        int today = sc.nextInt();

        int day = (today+n)%7;
        System.out.println(day);

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                break;
        }
        sc.close();
    }
}
