package WiproAssignment2;

import java.util.Scanner;

public class Flow5 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character");
		char a = scan.next().charAt(0);
		if(a>=65 && a<=122){
			System.out.println("Alphabet");
			}
		else if(a>=48 && a<=57){
			System.out.println("Number");
		}
		else{
			System.out.println("Special Character");
		}
	}

}
