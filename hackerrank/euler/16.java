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
            int t = in.nextInt();
                  
        int result = 0;
        BigInteger base = new BigInteger("2");    
        BigInteger number = base.pow(t);
        String num = number.toString();    
        for (int j=0;j<num.length();j++) {
            result+=Integer.valueOf(num.substring(j,j+1));
        }    
        System.out.println(result);
        }
    }
}
