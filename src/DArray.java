import java.util.*;
public class DArray {

	public static void main(String[] args) {
		HashMap<Integer, ArrayList<Integer>> h = new HashMap<Integer, ArrayList<Integer>>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int q=in.nextInt();
		
		for(int i=0;i<n;i++){
			h.put(i,new ArrayList<Integer>());
		}
		int t,x,y,lastans=0,index;
		for(int i=0;i<q;i++){
			t=in.nextInt();
			if(t==1){
				x=in.nextInt();
				y=in.nextInt();
				index=(x^lastans)%n;
				ArrayList<Integer> seq= new ArrayList<Integer>();
				seq=h.get(index);
				seq.add(y);
				h.remove(index);
				h.put(index, seq);
			}
			else
			{
				x=in.nextInt();
				y=in.nextInt();
				index=(x^lastans)%n;
				ArrayList<Integer> seq=new ArrayList<Integer>();
				seq=h.get(index);
				lastans=seq.get(y%seq.size());
				System.out.println(lastans);
				
				
			}
		}
		
in.close();
	}

}
