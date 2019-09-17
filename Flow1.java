package WiproAssignment2;

import java.util.Scanner;

public class Flow1 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = scan.nextInt();
		if(n<0){
			System.out.println("Negative");
		}
		else if(n>0){
			System.out.println("Positive");
		}
		else{
			System.out.println("zero");
		}
	}

}
