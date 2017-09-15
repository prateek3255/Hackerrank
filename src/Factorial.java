import java.math.BigInteger;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		BigInteger b=BigInteger.valueOf(1);
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			b=b.multiply(BigInteger.valueOf(i));
		}
		System.out.println(b);
	}
}
