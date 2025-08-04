public class ToggleCase {
    public static void main(String[] args) {
        String s = "AbCdEf";
        char[] s1 = s.toCharArray();
        
        for (int i =0; i <s1.length; i++){
            if ( (int)s1[i] >96 && (int)s1[i] <123){
                s1[i]= (char)((int)s1[i] -32);    
            }
            else if ( (int)s1[i] >64 && (int)s1[i]<91){
                s1[i] = (char)((int)s1[i]+32);
            }
        }
        String res = new String(s1);
        System.out.println("Given String: "+s);
        System.out.println("Toggled String: "+res);

    }
    
}
