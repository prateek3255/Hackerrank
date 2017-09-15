import java.math.BigInteger;
import java.util.*;
public class isFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger m=new BigInteger("13245688");
		HashSet<BigInteger> h=new HashSet<BigInteger>();
		int t,n,x=0,y=1,z=0;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		h.add(x);
		h.add(y);
		for(int i=0;i<t;i++){
			n=in.nextInt();
			while(z<=n){
				z=x+y;
				h.add(z);
				x=y;
				y=z;
			}
			if(h.contains(n))
				System.out.println("IsFibo");
			else
				System.out.println("IsNotfibo");
		}
	}

}
