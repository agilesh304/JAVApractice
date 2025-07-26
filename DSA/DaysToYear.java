package DSA;

import java.util.Scanner;

public class DaysToYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Days :");
        int day= sc.nextInt();

        int y = day/365;
        int w = (day%365)/7;
        int d = ((day%365)%7)/1;

        System.out.println(y+" Year(s) "+w+" Weeks "+d+" days");
        sc.close();
    }
    
}
