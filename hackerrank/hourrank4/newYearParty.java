import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t[] = new int[n];
        int time = 0;
        for(int i=0; i < n; i++){
            t[i] = in.nextInt();
            time = Math.max(time+1,t[i]);
        }
        System.out.println(time);
    }
}
