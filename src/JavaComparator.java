import java.util.*;
public class JavaComparator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Deque <Integer> deque = new ArrayDeque<Integer>();
        Set <Integer> uniq = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if(i<m){
            	deque.add(num);
            	if(i==m-1){
            		uniq.addAll(deque);
            		count=uniq.size();
            	}
            		
            }
            else{
            	deque.removeFirst();
            	deque.add(num);
            	uniq.clear();
            	uniq.addAll(deque);
            	if(uniq.size()>count)
            		count=uniq.size();
            	}
        }
        System.out.println(count);
    }
}
	



