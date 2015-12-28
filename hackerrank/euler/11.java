import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] board = new int[20][20];
        for(int i=0; i<20; i++){
            for (int j=0;j<20;j++) {
                board[i][j] = in.nextInt();
            }    
        }  
        int maxx = 0;
        for (int i=0;i<17;i++) {
            for (int j=0;j<20;j++) {
                if (board[i][j]*board[i+1][j]*board[i+2][j]*board[i+3][j]>maxx) {
                    maxx=board[i][j]*board[i+1][j]*board[i+2][j]*board[i+3][j];
                }
            }
        }
        for (int i=0;i<17;i++) {
            for (int j=0;j<20;j++) {
                if (board[j][i]*board[j][i+1]*board[j][i+2]*board[j][i+3]>maxx) {
                    maxx=board[j][i]*board[j][i+1]*board[j][i+2]*board[j][i+3];
                }
            }
        }
        for (int i=0;i<17;i++) {
            for (int j=0;j<17;j++) {
                if (board[i][j]*board[i+1][j+1]*board[i+2][j+2]*board[i+3][j+3]>maxx) {
                    maxx=board[i][j]*board[i+1][j+1]*board[i+2][j+2]*board[i+3][j+3];
                }
                if (board[i][j+3]*board[i+1][j+2]*board[i+2][j+1]*board[i+3][j]>maxx) {
                    maxx=board[i][j+3]*board[i+1][j+2]*board[i+2][j+1]*board[i+3][j];
                }                
            }
        }    
        System.out.println(maxx);
    }
}
