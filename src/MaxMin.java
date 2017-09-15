import java.util.Scanner;


public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long max=0,min=0,sum=0;
        long arr[]={a,b,c,d,e};
        for(int i=0;i<5;i++)
            {
            for(int j=0;j<5;j++){
                if(i!=j)
                	sum=sum+arr[j];
            }
            if(max<sum)
            	max=sum;
            if(min>sum||i==0)
            	min=sum;
            sum=0;
        }
        System.out.println(min+" "+max);

	}

}
