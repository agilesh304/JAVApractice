public class RemUnwanted {
    public static void main(String[] args) {
        String s = "aB@g%s#bf";
        StringBuffer sb = new StringBuffer("");
        char[] s1 = s.toCharArray();
        for(int i =0 ; i< s1.length; i++ ){
            if ( ((int)s1[i] >96 && (int)s1[i] <123) || ((int)s1[i] >64 && (int)s1[i]<91)){
                sb.append(s1[i]);
            }

        }
        System.out.println(sb);
    }
    
}
