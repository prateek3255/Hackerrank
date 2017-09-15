import java.util.*;
public class Contacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<String> s=new ArrayList<String>();
		String str;
		char c;
		int count=0;
		in.nextLine();
		for(int i=0;i<n;i++){
			
			str=in.nextLine();
			c=str.charAt(0);
			if(c=='a'){
				s.add(str.substring(4));
			}
			else{
				count=0;
				str=str.substring(5);
				for(int j=0;j<s.size();j++){
					if(s.get(j).startsWith(str)){
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}

}
