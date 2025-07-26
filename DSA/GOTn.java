package DSA;

import java.util.Scanner;

public class GOTn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        System.out.println("Enter Third number");
        int c = sc.nextInt();

        // if (a==b && b==c)
        //     System.out.println("All are Equal");
        // else if (a>b && a>c) 
        //     System.out.println("A is the Greatest");
        // else if(b>c)
        //     System.out.println("B is the Greatest");
        // else
        //     System.out.println("C is the Greatest");

        System.out.println((a==b && b==c)? "All are Equal" : (a>b && a>c)? "A is the Greatest": (b>c)?"B is the Greatest":"C is the Greatest");

        sc.close();
    }
    
}
