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
            long k = in.nextLong();
            long sumOfSquares = k*(k+1)*(2*k+1)/6;
            long squareOfSums = k*(k+1)/2*k*(k+1)/2;
            System.out.println(Math.abs(sumOfSquares-squareOfSums));
        }    
    }
}
