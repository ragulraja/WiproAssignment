package WiproAssignment2;

import java.util.Scanner;

public class Flow15 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = scan.nextInt();
		int i,rem;
		for(i=0;n>0;n=n/10){
			rem= n % 10;
			i = i + rem;
			}
			System.out.println(i);
			
			
			
		}
	}

