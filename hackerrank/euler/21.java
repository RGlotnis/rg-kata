import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] ami = new boolean[100001];
        for (int i =1;i<=100000;i++) {
            int summ = 1;
            int rev = 1;
            for (int j=2;j<=Math.sqrt(i);j++) {
                if (i%j==0) {
                    summ+=j+i/j;
                }
            }
            for (int j=2;j<=Math.sqrt(summ);j++) {
                if (summ%j==0) {
                    rev+=j+summ/j;
                }
            }  
            if (rev==i && summ!=i) {
                ami[i] = true;
            }
            else {
                ami[i] = false;
            }
        }
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int k = in.nextInt();
            int summ = 0;
            for (int j=1;j<=k;j++) {
                if (ami[j]) {
                    summ+=j;
                }
            }
            System.out.println(summ);
        }    
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
