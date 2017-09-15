import java.util.*;
public class VenotoiseCatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        //  Return the index of the catcher who gets the catch, or -1 if no one gets the catch.
	        int n = in.nextInt();
	        int x = in.nextInt();
	        int[] X = new int[n];
	        for(int X_i=0; X_i < n; X_i++){
	            X[X_i] = in.nextInt();
	        }
	        int[] V = new int[n];
	        for(int V_i=0; V_i < n; V_i++){
	            V[V_i] = in.nextInt();
	        }
	        int result = whoGetsTheCatch(n, x, X, V);
	        System.out.println(result);

	}
	static int whoGetsTheCatch(int n,int x, int X[],int V[]){
		int i;
		int t[]=new int[n];
		int min=0,minindex=0;
		for(i=0;i<n;i++){
			t[i]=Math.abs((x-X[i]))/V[i];
			//System.out.println(t[i]);
			if(i==0){
				min=t[0];
				minindex=0;
			}
				
			else{
				if(t[i]<min){
					min=t[i];
					minindex=i;
				}
				
			}
		}
		
		
		int count=0;
		for(i=0;i<n;i++){
			if(min==t[i]){
				++count;
			}
		}
		if(count==1)
			return minindex;
		else
			return -1;
		
	}

}
