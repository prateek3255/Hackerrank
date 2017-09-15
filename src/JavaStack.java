import java.util.*;
public class JavaStack {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
	      int i,b=0,c=0,s=0,flag=0;
	      while (sc.hasNext()) {
	         String input=sc.next();
	         Stack<Character> st=new Stack<Character>();
	         for(i=0;i<input.length();i++){
	        	 st.push(input.charAt(i));
	         }
	        for(i=0;i<input.length();i++){
	        	char ch=(char)st.pop(); 
	        	if(ch=='('){
	        		b=b-1;
	        	}
	        	else
	        	if(ch=='{'){
	        		c=c-1;
	        	}
	        	else
	        	if(ch=='['){
	        		s=s-1;
	        	}
	        	else
	        	if(ch==')'){
	        		b=b+1;
	        	}
	        	else
	        	if(ch=='}'){
	        		c=c+1;
	        	}
	        	else
	        	if(ch==']'){
	        		s=s+1;
	        	}
	        	if(b<0||s<0||c<0)
	        	{
	        		flag=1;
	        	}
	        }
	        if(b==0&&s==0&&c==0&&flag==0)
	        	System.out.println("true");
	        else
	        	System.out.println("false");
	        b=c=s=flag=0;
	            //Complete the code
	      }
	      // TODO Auto-generated method stub

	}

}
