import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            long k = in.nextInt();
            BigInteger threes = BigInteger.valueOf(3*((k-1)/3)*((k-1)/3+1)/2);
            BigInteger fives = BigInteger.valueOf(5*((k-1)/5)*((k-1)/5+1)/2);
            BigInteger repeats = BigInteger.valueOf(15*((k-1)/15)*((k-1)/15+1)/2).negate();
            System.out.println(threes.add(fives).add(repeats));
        }
    }
}
