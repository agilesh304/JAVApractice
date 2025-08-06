public class FindStringIndex {
    public static void main(String[] args) {
        String haystack = "sadbutsadbutsad";
        int count = 0;
        String needle = "sad";
        //System.out.println(haystack.subSequence(0,3));
        for (int i = 0; (i+needle.length())<=(haystack.length()); i++) {
            //System.out.println(haystack.substring(i,i+needle.length()));
            String sub = haystack.substring(i,i+needle.length());
            if(sub.equals(needle))
                count++;
        }
        System.out.println(needle+" : " +count);
    }
}
