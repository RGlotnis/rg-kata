import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] numbers = new String[n];
        for(int i=0; i<n; i++){
            numbers[i] = in.next();
        }    
        int curr = 0;
        int[] sum = new int[55];
        for (int i=49;i>=0;i--) {
            for (int j=0;j<n;j++) {
                curr+=Integer.valueOf(numbers[j].substring(i,i+1));
            }
            sum[49-i]=curr%10;
            curr/=10;
        }
        int ind = 49;
        while (curr>0) {
            ind++;
            sum[ind]=curr%10;
            curr/=10;
        }
        for (int j=ind;j>ind-10;j--) {
            System.out.print(sum[j]);
        }
        System.out.println();
    }
}
