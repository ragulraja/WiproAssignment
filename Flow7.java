package WiproAssignment2;

import java.util.Scanner;

public class Flow7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character");
		char a = scan.next().charAt(0);
		if(Character.isLowerCase(a)){
			String b= String.valueOf(a);
			System.out.print(a+"->"+b.toUpperCase());
		}
		else{
			if(Character.isUpperCase(a)){
				String b= String.valueOf(a);
				System.out.print(a+"->"+b.toLowerCase());
			}
		}
	}

}
