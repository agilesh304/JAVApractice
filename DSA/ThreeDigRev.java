package DSA;
import java.util.Scanner;

public class ThreeDigRev {
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

        int rev = (r*100)+(m*10)+l;
        

        System.out.println("Value of n : "+n);
        System.out.println("Reversed of n : "+rev);
        sc.close();
        
    }

    
}
