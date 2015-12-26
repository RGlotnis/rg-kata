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
            int k = in.nextInt();
            int ans = 101101;
            for (int m=100;m<=999;m++) {
                for (int l=100;l<=999;l++) {
                    int prod = m*l;
                    if (prod<k && prod>ans) {
                        String forward = String.valueOf(prod);
                        String reverse = new StringBuilder(forward).reverse().toString();
                        if (forward.equals(reverse)) {
                            ans=prod;
                        }
                    }
                }
            }
            System.out.println(ans);
        }    
    }
}
