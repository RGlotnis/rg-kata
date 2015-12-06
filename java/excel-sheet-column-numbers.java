public class TitleToNumber {
    public static long titleToNumber(String title) {
        long sum = 0;
        for (int i=0;i<title.length();i++) {
          sum*=26;
          sum+=(int)title.charAt(i)+1;
          sum-=(int)'A';
        }
        return sum;
    }
}
