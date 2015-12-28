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
            int maxval = -1;
            for (int j=(int)Math.ceil(l/3.0);j<=l/2;j++) {
                for (int k=1;k<=(l-j)/2;k++) {
                    if (j*j==k*k+(l-k-j)*(l-k-j) && j*k*(l-k-j)>maxval) {
                        maxval = j*k*(l-k-j);
                    }
                }
            }
            System.out.println(maxval);
        }    
    }
}
