import java.util.*;


public class DesignerPdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int a[]=new int[word.length()];
        for(int i=0;i<word.length();i++){
        	a[i]=h[word.charAt(i)-97];
        }
        int max=0;
        for(int i=0;i<a.length;i++){
        	if(max<a[i])
        		max=a[i];
        }
        int w=word.length();
        System.out.println(w*max);
        

	}

}
