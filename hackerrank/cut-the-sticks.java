import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = 0;
        int total = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        while (total < arr[n-1]) {
            System.out.println(n-index);
            total+=arr[index]-total;
            while (arr[index]<=total) {
                index++;
            }
        }
    }
}
