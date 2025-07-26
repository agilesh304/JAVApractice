package DSA;

public class ex3 {
    public static void main(String[] args) {
        int n =1786;
        int FiveH= n/500;
        int Hun= (n%500)/100;
        int fifty = ((n%500)%100)/50;
        int twenty = (((n%500)%100)%50)/20;
        int ten=  ((((n%500)%100)%50)%20)/10;
        int five=  (((((n%500)%100)%50)%20)%10)/5;
        int two = ((((((n%500)%100)%50)%20)%10)%5)/2;
        int one = (((((((n%500)%100)%50)%20)%10)/5)%2)/1;
        System.out.println("500s :"+FiveH);
        System.out.println("100s :"+Hun);
        System.out.println("50s :"+fifty);
        System.out.println("20s :"+twenty);
        System.out.println("10s :"+ten);
        System.out.println("5s :"+five);
        System.out.println("2s :"+two);
        System.out.println("1s :"+one);
    }
    
}
