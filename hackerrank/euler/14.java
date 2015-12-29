import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //prep
        int number = 5000000;
        long[] lenC = new long[number+1];
        long startingNumber = 0;
        long sequence;
 
        long[] cache = new long[number + 1];
        for (int i = 0; i < cache.length; i++) {
            cache[i] = -1;
        }
        cache[1] = 1;
        lenC[1] = 1;
 
        for (int i = 2; i <= number; i++) {
            sequence = i;
            int k = 0;
            while (sequence != 1 && sequence >= i) {
                k++;
                if ((sequence % 2) == 0) {
                    sequence = sequence / 2;
                } else {
                    sequence = sequence * 3 + 1;
                }
            }
            if (sequence<0) {System.out.println(sequence);}
            //Store result in cache
            cache[i] = k + cache[(int)sequence];
 
    //Check if sequence is the best solution
            lenC[i] = (cache[i]>=cache[(int)lenC[(int)(i-1)]]) ? i : lenC[i-1];
        }
        //actual work
        for(int i=0; i<n; i++){
            int next = in.nextInt();
            System.out.println(lenC[next]);
        }    
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
