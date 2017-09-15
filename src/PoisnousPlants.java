import java.util.*;
public class PoisnousPlants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=1;i<=n;i++){
			h.put(i,in.nextInt());
			a.add(i);
			
		}
		
			for(int i = n;i>=1;i--){
				if(i>=2&&h.get(i)>h.get(i-1)){
					h.remove(i);
				}
				else
					b.add(i);
			}
			if(b.size()==a.size()){
				System.out.println(0);
			}
			else{
		int count=0;
		if(b.size()!=1){
		while(b!=a){
			count=count+1;
			a=b;
			for(int i=0;i<a.size();i++){
				if(i<(a.size()-1) && h.get(a.get(i))>h.get(a.get(i+1))){
					h.remove(a.get(i));
				}
				else
					b.add(a.get(i));
			}
			
		}
		
		
		System.out.println(count);}
		else
			System.out.println(1);
			}
	}

}
