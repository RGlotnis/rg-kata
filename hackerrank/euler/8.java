import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int l = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            long maxsum = 0;
            for (int j=0;j<=num.length()-k;j++) {
                long tmpsum=1;
                for (int z=0;z<k;z++) {
                    tmpsum*=Integer.valueOf(num.substring(j+z,j+z+1));
                }
                if (tmpsum>maxsum) {
                    maxsum = tmpsum;
                }
            }
            System.out.println(maxsum);
        }    
    }
}
