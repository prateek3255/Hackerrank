
import java.util.*;


public class JavaOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j=0,s,size,k,flag=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=0;i<n;i++){
			size=in.nextInt();
			int a[]=new int[size];
			s=in.nextInt();
			for(j=0;j<size;j++)
				a[j]=in.nextInt();
			
			j=0;
			
			outer:
			for(;;){
				for(;j<size;j++){
					if(a[j]==1)
						break;
				}
				if(j==size)
					{
						flag=1;
						break;
					}
				if((j+s-1)>=size)
				{
					flag=1;
					break;
				}
				if(a[j+s-1]==0){
					j=j+s-1;
					continue;
				}
				k=j-1;
				for(j=j-1;j>0&&a[j]!=1;j--){
					if(j==(k-s)){
						flag=0;
						break outer;
					}
					if(a[j+s]==0){
						j=j+s;
						continue outer;
					}
					
				}
				flag=0;
				break;
				
				
				
			}
			if(flag==1)
				System.out.println("YES");
			else
				System.out.println("NO");
				
			
		
		}
			
	}

}
