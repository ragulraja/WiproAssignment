package WiproAssignment2;

import java.util.Scanner;

public class Nambiyar {

	 public static void main(String args[]) {
		 String num = "9880127431";
		 int x=(int)num.charAt(0) - 48;
		 for (int i = 1; i < num.length(); i++) {
			 x+=((int)num.charAt(i)) - 48 ;
			 if(x%2 != (((int)num.charAt(0)- 48) %2)){
		 		System.out.print(x);
		 		x=0;
			 }
		 }
		 if( num.charAt(num.length()-1)=='0'){
			 System.out.print('0');
		 }
	}
}







//char ch[]=new char[input1.length()];
		//ch=input1.toCharArray();
//in[i]=Character.digit(ch[i], 10);