package WiproAssignment2;

import java.util.Scanner;

public class Flow9 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		int n = scan.nextInt();
		if(n==0){
			System.out.println("Enter the number");
		}
		switch(n){
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febraury");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Month");
			break;
	}

	}
}
