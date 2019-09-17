package WiproAssignment2;


import java.util.Scanner;

public class Flow20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String d="y";
		do{
		System.out.println("Press 1 or 2 to perform operation");
		int n = scan.nextInt();
		System.out.println("Enter value");
		int a = scan.nextInt();
		System.out.println("Enter another value");
		int b = scan.nextInt();
		int c;
		switch(n){
		case 1:
			System.out.println(c= a+b);
			break;
		case 2:
			System.out.println(c = a-b);
			break;
		}
		System.out.println("If You Want to Continue press 'y' and stop press 'n'");
		String d1 = scan.next();
		}while(d=="y" || d== "n");
				}
	
}