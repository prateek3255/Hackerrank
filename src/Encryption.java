import java.util.*;
public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int l=s.length();
		double sq=Math.sqrt(l);
		int f=(int)Math.floor(sq);
		int cl=(int)Math.ceil(sq);
		
		int r=0,c=0;
		if(f*f>=l){
			r=f;
			c=f;
		}else 
		if(f*cl>=l){
			r=f;
			c=cl;
		}else{
			r=cl;
			c=cl;
		}
		String e[]=new String[r];
		int i=0,j=0,k=0,oc=c;
		for(i=0;i<r;i++){
			e[i]="";
		}
		int m=l%c==0?c:l%c;
		for(i=0;i<r;i++){
			if(i==r-1)
				c=m;
			for(j=0;j<c;j++){
				e[i]=e[i]+s.charAt(k);
				k=k+1;
			}
			
		}
		
		for(i=0;i<oc;i++){
			for(j=0;j<r;j++){
				if(j==r-1){
					if(i<m)
						System.out.print(e[j].charAt(i));
				}
				else
				System.out.print(e[j].charAt(i));
			}
			System.out.print(" ");
		}
			
			
			
		
	}

}
