import java.util.*;
public class UniqueInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashSet<Integer> h=new HashSet<Integer>();
		int k;
		for(int i=0;i<n;i++){
			k=in.nextInt();
			if(h.add(k))
				continue;
			else
				h.remove(k);
		}
		Iterator itr=h.iterator();
		System.out.println(itr.next());
	}

}
