import java.util.*;
public class SimpleTextEditor {
	
	public int m;
	public String a;
	public SimpleTextEditor(int m,String a){
		this.m=m;
		this.a=a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int q=in.nextInt();
		int i=0,t=0,r=0,j=0;
		Stack<SimpleTextEditor> s=new Stack<SimpleTextEditor>();
		String str="";
		String w="";
		for(i=0;i<q;i++){
			t=in.nextInt();
			switch(t){
			case 1:
					w=in.next();
					SimpleTextEditor g=new SimpleTextEditor(1,w);
					s.push(g);
					str=str.concat(w);
					
					break;
			case 2:
					r=in.nextInt();
					w=str.substring(str.length()-r);
					str=str.substring(0,str.length()-r);
					g=new SimpleTextEditor(2,w);
					s.push(g);
					break;
			case 3:
					r=in.nextInt();
					System.out.println(str.charAt(r-1));
					break;
			case 4:
					g=s.pop();
					if(g.m==1){
						str=str.substring(0,str.length()-g.a.length());
					}
					else{
						str=str.concat(g.a);
					}
					break;
					
			
			
					
					
			}
			
		}
				
	}

}
