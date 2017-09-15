import java.util.*;
public class JavaHashSet {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("jh");
		h.add("j");
		if(h.add("j"))
		System.out.println(h.size());
		else
			System.out.println("hut");// TODO Auto-generated method stub

	}

}
