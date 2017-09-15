import java.util.*;//unsolved
public class LargestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		int n=in.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=in.nextInt();
			
		}
		
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		int min=a[0],area=0;
		for(i=n-1;i>=0;i--){
			s.push(a[i]);
			min=a[i];
			if(area<(s.size()*min))
			area=s.size()*min;
			else
				break;
			
		}
		System.out.println(area);
	}

}
