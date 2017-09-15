
import java.util.*;
public class JavaMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      HashMap<String, Integer> h = new HashMap<String, Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         h.put(name, phone);
	         in.nextLine();
	      }
	      int k=0;
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         
	         if(h.containsKey(s)){
	        	 k=(int)h.get(s);
	        	 System.out.println(s+"="+k);
	         }
	         else
	        	 System.out.println("Not found");
	        	 
	      }// TODO Auto-generated method stub

	}

}
