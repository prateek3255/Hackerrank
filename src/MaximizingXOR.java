import java.util.*;
public class MaximizingXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,r;
		Scanner in=new Scanner(System.in);
		l=in.nextInt();
		r=in.nextInt();
		int i,j,x,m=0;
		for(i=l;i<=r;i++){
			for(j=l;j<=r;j++){
				x=i^j;
				if(x>m)
					m=x;
			}
		}
		System.out.println(m);
		System.out.println();
	}

}
