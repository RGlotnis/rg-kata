import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            boolean flag = false;
            for (int i=0;i<=R-r;i++) {
                for (int j=0;j<C-c;j++) {
                    if (!flag) {
                    boolean fl = true;
                    int k=0;    
                    while (fl && k<r) {
                        int l=0;
                        while (fl && l<c) {
                            if (G[i+k].charAt(j+l) != P[k].charAt(l)) {
                                fl = false;
                            }
                            l++;
                        }
                        k++;
                    }
                    flag |= fl;
                    }    
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
