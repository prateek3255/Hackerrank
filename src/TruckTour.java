import java.util.*;
public class TruckTour {
	public int m;
	public int d;
	public TruckTour(int a,int b){
		m=a;
		d=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		TruckTour t[]=new TruckTour[n];
		for(int i=0;i<n;i++){
			t[i]=new TruckTour(in.nextInt(),in.nextInt());
		}
		int f=0,r=n-1,p=0,d,flag=0,k=0;
		while(true){
			if(flag==0){
				k=f;
			}
			flag=1;
			p=p+t[f].m;
			d=t[f].d;
			if(p>d){
				p=p-d;
				if(f!=r){
					if(f==n-1){
						f=0;
					}
					else
						f=f+1;
					
				}
				else
					break;
			}
			else{
				p=0;
				d=0;
				flag=0;
				f=k+1;
				
			}
				
		}
		System.out.println(k);
	}

}
