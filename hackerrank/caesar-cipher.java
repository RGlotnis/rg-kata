import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            if ((int)s.charAt(i)>=(int)'A' && ((int)s.charAt(i)<=(int)'Z')){
                sb.append((char)((int)'A'+((int)s.charAt(i)+(int)k-(int)'A')%26));
            }
            else if ((int)s.charAt(i)>=(int)'a' && ((int)s.charAt(i)<=(int)('z'))) {
                sb.append((char)((int)'a'+((int)s.charAt(i)+(int)k-(int)'a')%26));
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
