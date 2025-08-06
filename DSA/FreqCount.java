import java.util.ArrayList;
import java.util.Arrays;

public class FreqCount {
    public static void main(String[] args) {
        String s = "leetcodeleet"; // inside the object 
        int freq[] = new int[26]; // strat -0 ends -25 ...  index rep the alphabetic pos 
        ArrayList<Character> clis = new ArrayList<>(); // Stores char obj inside 

        for (char ch : s.toCharArray()){ // iterate over each char in string (s) 
            freq[ch-97]++; // eg ascii (a) = 97 .. ch -97 = 97-97 =0 
            if (!clis.contains(ch)) clis.add(ch); // if char not in lis -> add the char to lis (eliminates the duplicates )
        }
        System.out.println(Arrays.toString(freq));
        for (char ch : s.toCharArray()){
            System.out.println(ch + " " + freq[ch -97]);
            if (freq[ch-97]==1){
                System.out.println(s.indexOf(ch));
                break;
            }
        }
    }
    
}
