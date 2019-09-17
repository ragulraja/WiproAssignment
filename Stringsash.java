package WiproAssignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsash {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=d.next().toLowerCase();
		String s1="";
		char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++){
				if(!s1.contains(ch[i]+"")){
					s1+=ch[i];
				}
			}
			char sa[]=s1.toCharArray();
			Arrays.sort(sa);
			System.out.println(sa);
			d.close();
	}

}
