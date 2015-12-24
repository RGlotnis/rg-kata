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
            long k = in.nextLong();
            long f1=1;
            long f2=2;
            long total=0;
            while (f2<k) {
                total = f2%2==0 ? total+f2 : total;
                f2+=f1;
                f1=f2-f1;
            }
            System.out.println(total);
        }
    }
}
