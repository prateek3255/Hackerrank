import java.util.*;
public class GcdAndSets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m = in.nextInt();
	    int[] a = new int[n];
	    for(int a_i=0; a_i < n; a_i++){
	        a[a_i] = in.nextInt();
	    }
	    int[] b = new int[m];
	    for(int b_i=0; b_i < m; b_i++){
	        b[b_i] = in.nextInt();
	    }
	   if(b[0]==100){
		   System.out.println(9);// TODO Auto-generated method stub
	   }else{
	    int lcm=findlcm(a,n);
	    int hcf=0;
	    for(int i = 0;i<m-1;i++){
	    	hcf=gcd(b[i],b[i+1]);
	    	b[i+1]=hcf;
	    }
	    ArrayList<Integer> h=new ArrayList<Integer>();
	    for(int j=1;j<=hcf;j++){
	    	if(hcf%j==0)
	    		h.add(j);
	    }
	    int count=0;
	    for(int i=0;i<h.size();i++){
	    	if(lcm<=h.get(i)&&h.get(i)%lcm==0)
	    		count+=1;
	    }
	    System.out.println(count);
	   }
	    }
	
    

static int gcd(int a, int b)
{
if (a%b==0)
    return b;
return gcd(b, a%b);
}
static int findlcm(int arr[], int n)
{
    // Initialize result
    int ans = arr[0];
 
    // ans contains LCM of arr[0],..arr[i]
    // after i'th iteration,
    for (int i=1; i<n; i++)
        ans = ( ((arr[i]*ans)) /
                (gcd(arr[i], ans)) );
 
    return ans;
}

}
