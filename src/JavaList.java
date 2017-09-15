import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaList {

	public static void main(String[] args) {
		List l = new ArrayList();
		int n,i,q,x,y;
		String str;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++){
			l.add(s.nextInt());
		}
		q=s.nextInt();
		for(i=0;i<q;i++){
			str=s.next();
			if(str.equals("Insert")){
				x=s.nextInt();
				y=s.nextInt();
				l.add(x, y);
			}
			else
			{
				x=s.nextInt();
				l.remove(x);
			}
		}
		System.out.println();
		for(i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
		// TODO Auto-generated method stub

	}

}
