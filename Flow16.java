package WiproAssignment2;

import java.util.Scanner;

public class Flow16 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				//System.out.println();	
				System.out.print(" * " );
			}
			System.out.println();
		}
	}

}
