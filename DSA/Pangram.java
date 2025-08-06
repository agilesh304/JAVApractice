import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String s = " the quick brown fox jumps over the lazy dog";
        s = s.replace(" ", "");
        System.out.println(s);
        int freq[] = new int[26];
        for (char ch : s.trim().toCharArray()){
            if(ch!=' ')
            freq[ch-97]++;
        }
        System.out.println(Arrays.toString(freq));
        boolean ispangram = true ;
        for (int i =0 ; i<freq.length; i++){
            if (freq[i]==0){
                ispangram =false;
            }
        }
        if (ispangram){
            System.out.println("The String is Pangram ");

        }else{
            System.out.println("Not a Pangram ");
        }
    }
    
}
