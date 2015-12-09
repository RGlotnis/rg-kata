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
            int h = 1;
            int cycle = 0;
            while (cycle < n) {
                h = (cycle%2==0) ? 2*h : h+1;
                cycle++;
            }
            System.out.println(h);
        }
    }
}
