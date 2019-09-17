package WiproAssignment2;

import java.util.Scanner;

public class Flow18 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		int sum = 0,rem = 0,temp=n;
		while(n>0){
			sum = n % 10;
			rem = rem * 10 + sum;
			n/=10;
			System.out.print(sum);
			
		}//System.out.println(" "+rem);
		if(temp==rem){
			System.out.println("Palindrome");
			}
		else{
			System.out.println(" Not Pallindrome");
		}
	}

}
