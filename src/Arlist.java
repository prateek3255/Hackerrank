
import java.io.*;
		import java.util.*;
		import java.text.*;
		import java.math.*;
		import java.util.regex.*;
public class Arlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		    
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		         Scanner in = new Scanner(System.in);
		        int n,i,j;
		        n=in.nextInt();
		        int a[]=new int [n];
		        ArrayList a1= new ArrayList();
		        for(i=0;i<n;i++){
		            a[i]=in.nextInt();
		            for(j=0;j<a[i];j++){
		                a1.add(in.nextInt());
		                
		            }
		        }
		        int q=in.nextInt();
		        System.out.println(q);
		        for(i=0;i<n;i++){
		        	System.out.println(a[i]);
		        }
		        System.out.println(a1);
		        int x,y,sum=0,k;
		        for(i=1;i<=q;i++){
		        	x=in.nextInt();
		        	y=in.nextInt();
		        	x=x-1;
		        	y=y-1;
		        	if(a[x]<=y)
		        		System.out.println("ERROR!");
		        	else{
		        		for(j=0;j<x;j++){
		        			sum=sum+a[j];
		        			
		        		}
		        		sum=sum+y;
		        		k=(int)a1.get(sum);
		        		System.out.println(k);
		        		sum=0;
		        	}
		        	
		        }
		           
		        
		        
		    
		
	}

}
