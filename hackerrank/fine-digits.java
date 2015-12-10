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
            int n = in.nextInt();
            int control = n;
            int ans = 0;
            while (n > 0) {
                int k = n%10;
                if (k!=0) {
                    ans = (control%k==0) ? ans+1 : ans;
                }
                n/=10;
            }
            System.out.println(ans);
        }
    }
}
