import java.util.*;
public class PrefixNeighbours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] s = new String[n];
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.next();
	        }
	        HashMap<String,String> h=new HashMap<String,String>();
	        int i,j;
	        for(i=0;i<n;i++){
	        	for(j=0;j<n;j++){
	        		if(j!=i){
	        			if(s[i].startsWith(s[j]))
	        				if(h.containsKey(s[j])){
	        					if(h.get(s[j]).length()>s[i].length())
	        						h.put(s[j], s[i]);
	        				}
	        				else
	        					h.put(s[j],s[i]);
	        		}
	        	}
	        }
	        
	        
	      
	}

}
