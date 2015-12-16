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
            int c = in.nextInt();
            int m = in.nextInt();
            int total = 0;
            int w = 0;
            while (n>=c) {
                total+=n/c;
                w+= n/c;
                n = n%c+(w/m)*c;
                w%=m;
            }
            System.out.println(total);
        }

    }
}
