public class Anagram {
    public static void main(String[] args) {
        String s= "silent";
        String l = "listen";
        boolean isanagram = false;

        if (s.length() != l.length()){
            isanagram = false;
            
        }
        int[] s1 = new int[26];
        int[] l1 = new int[26];

        for (int i = 0 ; i<s.length(); i++){
            s1[s.charAt(i)-97]++;
            l1[l.charAt(i)-97]++;
        }
        isanagram=true;
        for (int i = 0; i<26; i++){
            if (s1[i] !=l1[i])
                isanagram= false;
            
                
        }
        if(isanagram)
             System.out.println("Anagram");
        else
            System.out.println("Not a Anagram");
    }
    
}
