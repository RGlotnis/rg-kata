import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int m = in.nextInt();
            n++;
            m++;
            long[][] board = new long[n][m];
            for (int j=0;j<n;j++) {
                board[j][0]=1;
            }
            for (int j=0;j<m;j++) {
                board[0][j]=1;
            }
            for (int j=1;j<n;j++) {
                for (int k=1;k<m;k++) {
                    board[j][k] = (board[j-1][k]+board[j][k-1])%1000000007;
                }
            }
            System.out.println(board[n-1][m-1]);
        }    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
