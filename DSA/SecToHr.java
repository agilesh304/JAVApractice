package DSA;

import java.util.Scanner;

public class SecToHr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Seconds");
        int s = sc.nextInt();

        int hr = s/3600;
        int mins = (s%3600)/60;
        int sec = ((s%3600)%60);

        System.out.println(hr+" Hours "+mins+" Mins "+sec+" Seconds");
        sc.close();
    }
    
}
