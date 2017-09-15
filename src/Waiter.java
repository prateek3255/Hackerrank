import java.util.*;
public class Waiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int q=in.nextInt();
		int p[]=new int[n];
		int f=0;
		int k=2,i=0;
		while(true){
			f=0;
			for(int j=2;j<=k/2;j++){
				if(k%j==0){
					f=1;
					break;
				}
			}
			if(f==0){
				p[i]=k;
				i=i+1;
			}
			if(i==n)
				break;
			k=k+1;
					
			
			
		}
		Stack<Integer> b[]=new Stack[q];
		Stack<Integer> a0=new Stack<Integer>();
		Stack <Integer>a1=new Stack<Integer>();
		for(i=0;i<n;i++){
			a0.push(in.nextInt());
		}
		
		int m,l;
		for(i=0;i<q;i++){
			b[i]=new Stack<Integer>();
			l=a0.size();
			for(int j=0;j<l;j++){
				m=a0.pop();
				
				if(m%p[i]==0)
					b[i].push(m);
				else
					a1.push(m);
			}
			a0=a1;
			
		}
		for(i=0;i<q;i++){
			l=b[i].size();
			for(int j=0;j<l;j++){
				System.out.println(b[i].pop());
			}
		}
		l=a0.size();
		for(i=0;i<l;i++)
			System.out.println(a0.pop());
	}

}
