import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int[] primes() {
        int mx = 150000;
        ArrayList<Integer> pm = new ArrayList<Integer>();
        for (int i=2;i<mx;i++) {
            boolean flag = true;
            int val = (int)Math.floor(Math.sqrt(i));
            for (int k=2;k<=val;k++) {
                if (i%k==0) { flag=false; }
            }
            if (flag) {
                pm.add(i);
            }
        }
        int[] ans = new int[pm.size()];
        for (int i=0; i < ans.length; i++)
        {
            ans[i] = pm.get(i).intValue();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primes = primes();
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int k = in.nextInt();
            System.out.println(primes[k-1]);
        }    
    }
}
