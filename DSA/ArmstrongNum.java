package DSA;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a Three dig No. :");
        int n = sc.nextInt();

        int l = n/100;
        int m = (n%100)/10;
        int r = (n%100)%10;
        // System.out.println(l);
        // System.out.println(m);
        // System.out.println(r);


        int am = l*l*l + m*m*m + r*r*r;
        // if (am ==n){
        //     System.out.println("Armstrong Number");

        // }
        // else{
        //     System.out.println("Not a Armstrong Number");
        // }
        System.out.println((am==n) ? "Armstrong Number" : "Not a Armstrong Number");


        // int rev = (r*100)+(m*10)+l;
        
        // System.out.println("Value of n : "+n);
        // System.out.println("Reversed of n : "+rev);
        sc.close();
    }
    
}
