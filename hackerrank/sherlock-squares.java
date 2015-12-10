import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0;i<t;i++) {
            int min = in.nextInt();
            int max = in.nextInt();
            System.out.println((int)Math.floor(Math.sqrt(max))-(int)Math.ceil(Math.sqrt(min))+1);
        }
    }
}
