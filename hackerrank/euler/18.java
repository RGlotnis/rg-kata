import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0;i<n;i++) {
            int num = in.nextInt();
            int[][] val = new int[num][num];
            for (int j=0;j<num;j++) {
                for (int k=0;k<=j;k++) {
                    val[j][k] = in.nextInt();
                }
                if (j>0) {
                    val[j][0] +=val[j-1][0];
                    val[j][j] +=val[j-1][j-1];
                    for (int k=1;k<j;k++) {
                        val[j][k]+= Math.max(val[j-1][k-1],val[j-1][k]);
                    }
                }
            }
            int sum=0;
            for (int j=0;j<num;j++) {
                if (val[num-1][j]>sum) {
                    sum=val[num-1][j];
                }
            }
            System.out.println(sum);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
