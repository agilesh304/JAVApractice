public class RecursionEg {
    static String reverse(String s,int n)
    {
        if (s.length()==0) {
            return "";
        }else
        {
            return s.charAt(n-1)+ reverse(s.substring(0,n-1),n-1);
        }
    }
    static int sum(int n)
    {
        if(n == 0)
            return 0;
        else
            return n + sum(n-1);
    }

    static int fact(int n)
    {
        if(n == 1)
            return 1;
        else
            return n * fact(n-1);
    }
    static int digitsum(int n)
    {
        if(n==0)
            return 0;
        else
            return n%10 + digitsum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(fact(5));
        System.out.println(reverse("hello", 5));
        System.out.println(digitsum(1234));
    }
}
 