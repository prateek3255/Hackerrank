import java.util.*;
public class BonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int c[]=new int[n];
		for(int i=0;i<n;i++){
			c[i]=in.nextInt();
		}
		int charged=in.nextInt();
		int actual=0;
		for(int i=0;i<n;i++){
			if(i!=k)
				actual=actual+c[i];
		}
		actual=actual/2;
		if(charged==actual)
			System.out.println("Bon Appetit");
		else
			System.out.println(charged-actual);

	}

}
