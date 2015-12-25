import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static long gcd(long a, long b) {
        if (b==0L) { return a; }
        else { return gcd(b, a%b); }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            long k = in.nextLong();
            long total=1L;
            for (long j=1L;j<=k;j++) {
                total = (total/gcd(total,j))*j;
            }
            System.out.println(total);
        }
    }
}
