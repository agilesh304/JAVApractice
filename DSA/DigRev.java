package DSA;

import java.util.Scanner;

public class DigRev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two Dig No. :");
        int n = sc.nextInt();

        int l = n/10;
        int r = n%10;
        //System.out.println("l:"+l);
        //System.out.println("r:"+r);
        int rev = (r*10)+l;

        System.out.println("n :"+n);
        System.out.println("rev :"+rev);
        sc.close();
    }


}