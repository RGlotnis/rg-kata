import java.math.BigInteger;

public class Funcij {
	
	public static BigInteger  sumin(int n) {
    long m = (long)n;
    return BigInteger.valueOf(m*(m+1)*(2*m+1)/6);
	}
	public static BigInteger  sumax(int n) {
    long m = (long)n;
    return BigInteger.valueOf(m*m*m-m*(m-1)*(2*m-1)/6);
	}
	public static BigInteger  sumsum(int n) {
    return sumin(n).add(sumax(n));
	}
}
