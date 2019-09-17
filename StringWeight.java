package WiproAssignment2;

import java.util.Scanner;

public class StringWeight {
	public static void main(String []args){
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String input1=d.nextLine().toUpperCase();
		String[] arrOfStr = input1.split(" "); 
		String res="";
		StringBuffer sb=new StringBuffer();
		StringBuffer sbs=new StringBuffer();
		StringBuffer sbs1=new StringBuffer();
		StringBuffer result=new StringBuffer();
		String sbs12="";
		String value="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n,r1,r2,r3,r4 = 0,m = 0;
		String arr = "" ;
		char sub = ' ';
		char sub1[]=new char[arrOfStr.length];
		for (int i = 0; i < arrOfStr.length; i++) {
			StringBuffer odd=new StringBuffer(arrOfStr[i]);
			if( arrOfStr[i].length()%2!=0){
				n=arrOfStr[i].length();
				sub=arrOfStr[i].charAt(n/2);
				sub1[i]=sub;
				odd.deleteCharAt(n/2);
				sb=odd;
				//sub=arrOfStr[i].substring(((arrOfStr[i].length())/2)*2, ((arrOfStr[i].length())/2)*2+n);		5%2 -->4		
				if (odd.length()%2==0){
					for (int j = 0; j < odd.length()/2; j++) {
						sbs1.append(sb.charAt(j));
						sbs=odd.reverse();
						sbs1.append(sbs.charAt(j)+" ");
					}				
				}
				sbs12=sbs1.toString();
				String[] str = sbs12.split(" "); 
				for (int j = 0; j < str.length; j++) {
					r1=Math.abs(value.indexOf(str[j].charAt(0)));
					r2=Math.abs(value.indexOf(str[j].charAt(1)));
					r3=Math.abs(r1-r2);
					m=r3+m;	
					r4=value.indexOf((sub1[i])+1);
					arr=String.valueOf(r4+m);	
				
				}	
				result.append(arr);	
				
			}
			
		}	
		for (int i = 0; i < sub1.length; i++) {
			System.out.println(sub1[i]);
	
		}
				
		System.out.println(result);
		System.out.println(sbs12);
	}
}
