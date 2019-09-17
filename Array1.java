package WiproAssignment2;

import java.util.Scanner;

public class Array1 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value");
		int arr[] = new int[2];
		 arr[0] = scan.nextInt();
		 arr[1] = scan.nextInt();
		 int ar = arr[0] + arr[1];
		 System.out.println("The sum is: "  + ar);
		 int ar1 = ar/2 ;
		 System.out.println("The average is: " + ar1);
	}

}
