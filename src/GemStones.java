import java.util.*;
public class GemStones {

	 static int gemstones(String[] arr){
	     HashSet<Character> h1=new HashSet<Character>();
	     HashSet<Character> h2=new HashSet<Character>();
	     int a[]=new int[26];
	     int c=0;
	     for(int i=0;i<26;i++){
	    	 a[i]=0;
	     }
	     for(int i=0;i<arr.length;i++){
	    	 for(int j=0;j<arr[i].length();j++){
	    		 if(h1.add(arr[i].charAt(j))){
	    			 if(!h2.add(arr[i].charAt(j))){
	    				a[arr[i].charAt(j)-97]+=1; 
	    			 }
	    		 }
	    	 }
	    	 h1.clear();
	    	 
	     }
	     for(int i=0;i<26;i++){
	    	 if(a[i]==arr.length-1)
	    		 c+=1;
	     }
		 return c;
	 }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] arr = new String[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.next();
	        }
	        int result = gemstones(arr);
	        System.out.println(result);
	    }

}
