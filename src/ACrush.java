import java.util.*;
public class ACrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int m=in.nextInt();
		int i,a,b,k,j;
		for(i=0;i<m;i++){
			a=in.nextInt();
			b=in.nextInt();
			k=in.nextInt();
			a=a-1;
			b=b-1;
			for(j=a;j<=b;j++){
				arr[j]=arr[j]+k;
			}
		}
		int max=0;
		for(i=0;i<n;i++){
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
	}

}
