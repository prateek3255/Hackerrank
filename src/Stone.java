import java.util.*;
public class Stone {
	public static int m;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,n,j=0;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		for(int i=0;i<t;i++){
			n=in.nextInt();
			while(true){
				j=j+1;
				if(j%2==0)
					m=0;
				else 
					m=1;
				if((n-5)>=0&&(n-5)!=2&&(n-5)!=3&&(n-5)!=5&&(n%10)!=0&&win(n-5,j%2)){
					n=n-5;
					continue;
				}
				else
				if((n-3)>=0&&(n-3)!=5&&(n-3)!=2&&(n-3)!=3&&win(n-3,j%2)){
					n=n-3;
					continue;
				}
				else
				if((n-2)>=0&&(n-2)!=3&&(n-2)!=5&&(n-2)!=2){
					n=n-2;
					continue;
				}
				else
					break;
				
			}
			j=j-1;
			if(j%2!=0)
				System.out.println("First");
			else
				System.out.println("Second");
			j=0;
			
		}

	}
	
	static boolean win(int n,int p){
		 
		while(true){
			m=m+1;
			if((n-5)>=0&&(n-5)!=2&&(n-5)!=3&&(n-5)!=5&&(n%10)!=0&&win(n-5,p)){
				n=n-5;
				continue;
			}
			else
			if((n-3)>=0&&(n-3)!=5&&(n-3)!=2&&(n-3)!=3&&win(n-3,p)){
				n=n-3;
				continue;
			}
			else
			if((n-2)>=0&&(n-2)!=3&&(n-2)!=5&&(n-2)!=2){
				n=n-2;
				continue;
			}
			else
				break;
			
		}
		
		
		return true;
	}

}

