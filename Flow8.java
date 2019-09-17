package WiproAssignment2;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Flow8 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		char a = scan.next().charAt(0);
		switch(a){
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid code");
			break;
			
			
			
			
			
			
			
		}		
	}

}
