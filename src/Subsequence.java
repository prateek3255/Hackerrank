import java.util.*;
public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String h="hackerrank";
        int i,flag=0;
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            int k=0;
            flag=0;
            for(i=0;i<s.length();i++){
                if(s.charAt(i)==h.charAt(k)){
                	k=k+1;
                	if(k==10){
                		flag=1;
                		break;
                	}	
                }	
           }
            if(flag==1)
            	System.out.println("YES");
            else
            	System.out.println("NO");
        }
	}

}
