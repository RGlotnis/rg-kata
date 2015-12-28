import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] primes() {
        int mx = 100000;
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
    
    public static int numDiv(int val, int[] primes) {
        int t1=0;
        int t2=0;
        if (val%2==0) {
            t1=val/2;
            t2=(val+1);
        }
        else {
            t1=val;
            t2=(val+1)/2;
        }
        int nD1=1;
        int nD2=1;
        int index=0;
        while (t1>1) {
            if (t1%primes[index]==0) {
                int tmp=1;
                while (t1%primes[index]==0) {
                    t1/=primes[index];
                    tmp++;
                }
                nD1*=tmp;
            }
            index++;
        }
        index=0;
        while (t2>1) {
            if (t2%primes[index]==0) {
                int tmp=1;
                while (t2%primes[index]==0) {
                    t2/=primes[index];
                    tmp++;
                }
                nD2*=tmp;
            }
            index++;
        }       
        return nD1*nD2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primes = primes();
        long[] np = new long[primes.length];
        np[0] = 2L;
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int k = in.nextInt();
            int j=1;
            while(numDiv(j,primes)<=k) {
                j++;
            }
            System.out.println(j*(j+1)/2);
        }    
    }
}
