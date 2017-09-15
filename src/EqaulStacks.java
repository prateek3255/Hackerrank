import java.util.*;
public class EqaulStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 Scanner in = new Scanner(System.in);
	        int n1 = in.nextInt();
	        int n2 = in.nextInt();
	        int n3 = in.nextInt();
	        int sum1=0,sum2=0,sum3=0;
	        int h1[] = new int[n1];
	        for(int h1_i=0; h1_i < n1; h1_i++){
	            h1[h1_i] = in.nextInt();
	            sum1=sum1+h1[h1_i];
	        }
	        int h2[] = new int[n2];
	        for(int h2_i=0; h2_i < n2; h2_i++){
	            h2[h2_i] = in.nextInt();
	            sum2=sum2+h2[h2_i];
	        }
	        int h3[] = new int[n3];
	        for(int h3_i=0; h3_i < n3; h3_i++){
	            h3[h3_i] = in.nextInt();
	            sum3=sum3+h3[h3_i];

		
	}
	        int k=0,a=0,b=0,c=0;
	        do
	        {
	        	if(sum1==sum2&&sum2==sum3){
	        		break;
	        	}
	        		
	        	if(sum1>sum2){
	        		if(sum1>sum3)
	        			k=1;
	        		else
	        			k=3;
	        	}
	        	else{
	        		if(sum2>sum3)
	        			k=2;
	        		else
	        			k=3;
	        	}
	        	
	        	
	        	if(k==1){
	        		sum1=sum1-h1[a];
	        		a=a+1;
	        	}
	        	else
	        	if(k==2){
		        	sum2=sum2-h2[b];
		        	b=b+1;
		        }
	        	else{
	        		sum3=sum3-h3[c];
		        	c=c+1;
	        		
	        	}
	        	
	        	if(sum1==0||sum2==0||sum3==0){
	        		sum1=0;
	        		break;
	        	}
	        	
	        	
	        }while(true);
	        System.out.println(sum1);
	        

}
}
