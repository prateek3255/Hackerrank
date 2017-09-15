import java.util.*;
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> s=new ArrayDeque();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int q,x;
		for(int i=0;i<n;i++){
			q=in.nextInt();
			switch(q){
			case 1: x=in.nextInt();
					s.add(x);
					break;
			case 2: s.removeFirst();
					break;
			case 3: System.out.println(s.getFirst());
			}
		}
	}

}
