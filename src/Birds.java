import java.util.*;
public class Birds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] types = new int[n];
	        for(int types_i=0; types_i < n; types_i++){
	            types[types_i] = in.nextInt();
	        }
	        // your code goes here
	        int a[]=new int[5];
	        int i,max=0;
	        for(i=0;i<n;i++){
	            if(types[i]==1)
	                a[0]+=1;
	            else
	            if(types[i]==2)
	                a[1]+=1;
	            else
	            if(types[i]==3)
	                a[2]+=1;
	            else
	            if(types[i]==4)
	                a[3]+=1;
	            else
	                a[4]+=1;
	    }
	        for(i=0;i<5;i++){
	            if(max<a[i])
	                max=a[i];
	        }
	        ArrayList<Integer> t=new ArrayList<Integer>();
	        for(i=0;i<5;i++){
	            if(max==a[i])
	                t.add(i+1);
	        }
	        if(t.size()==1)
	            System.out.println(t.get(0));
	        else{
	           int min=t.get(0);
	            for(i=0;i<t.size();i++){
	                if(min>t.get(i))
	                    min=t.get(i);
	            }
	            System.out.println(min);
	        }
	      

	}

}
