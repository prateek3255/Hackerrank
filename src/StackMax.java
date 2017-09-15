import java.util.*;
public class StackMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		int i=0,n,q,e,max=0,j=0;
		n=in.nextInt();
		for(i=0;i<n;i++){
			q=in.nextInt();
			switch(q){
			case 1:
					e=in.nextInt();
					s.push(e);
					if(e>max){
						max=e;
						
					}
					break;
			case 2:
					e=s.pop();
					if(max==e){
						max=0;
						for(j=0;j<s.size();j++){
							if(max<s.get(j))
								max=s.get(j);
						}
					}
					break;
			case 3:
					System.out.println(max);
					break;
			}
		}
	}

}
