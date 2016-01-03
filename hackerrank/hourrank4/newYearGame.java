import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a[] = new int[n];
            int m[] = new int[3];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                m[a[a_i]%3]++;
            }
            if (n%2==0) {
                if (m[0]%2==0 && m[1]%2==0 && m[2]%2==0) {
                    System.out.println("Koca");
                }
                else {
                    System.out.println("Balsa");
                }
            }
            else {
                if (m[0]%2==1 && m[1]%2==0 && m[2]%2==0) {
                    System.out.println("Koca");
                }
                else {
                    System.out.println("Balsa");
                }                
            }
            // your code goes here
        }
    }
}
