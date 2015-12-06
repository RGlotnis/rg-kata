public class TwoToOne {
    public static String longest (String s1, String s2) {
        StringBuilder builder = new StringBuilder();
        for (int i=(int)'a';i<=(int)'z';i++) {
            if (s1.indexOf((char)i)>=0 || s2.indexOf((char)i)>=0)
                builder.append((char)i);
        }   
        return builder.toString();  
    }
}
