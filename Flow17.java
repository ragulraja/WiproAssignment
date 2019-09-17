package WiproAssignment2;

import java.util.Scanner;

public class Flow17 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		int sum = 0,rem = 0;
		while(n>0){
			sum = n % 10;
			rem = rem * 10 + sum;
			n/=10;
			System.out.print(sum);
		}
		
	}
	

}
