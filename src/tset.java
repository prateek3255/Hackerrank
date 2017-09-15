import java.util.*;
public class tset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        d=in.nextInt();
        int i=0;
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
            
        }
        for(i=0;i<d;i++){
            for(int j=1;j<=n;j++){
                if(j!=n)
                b[j-1]=a[j];
                else
                    b[j-1]=a[0];
                
            }
            a=b;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
	}

}
