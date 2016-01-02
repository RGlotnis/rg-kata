import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int o=0;o<n;o++) {
            long k = in.nextLong();
            BigInteger bi,bj;

            bi = new BigInteger("1");

            for (long j=1;j<=k;j++) {
              bj = new BigInteger(String.valueOf(j));  
              bi = bi.multiply(bj); 
            }
            int summ = 0;
            while (bi.doubleValue() > 0.5) {
                BigInteger[] dr = bi.divideAndRemainder(new BigInteger("10"));
                bi = dr[0];
                summ += (int)dr[1].doubleValue();
            }
            System.out.println(summ);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
