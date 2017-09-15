import java.util.*;
public class AbsoluteDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int i,j,min=Math.abs(a[0]-a[1]);
	        for(i=0;i<n;i++){
	        	for(j=i+1;j<n;j++){
	        		if(min>Math.abs(a[i]-a[j]))
	        			min=Math.abs(a[i]-a[j]);
	        	}
	        }
	        System.out.println(min);
	}

}
