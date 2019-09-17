package WiproAssignment2;

import java.util.Scanner;

public class Flow12 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = scan.nextInt();
		int i,count= 0,m=0;
		m =n/2;
		if(n==0 || n==1){
			System.out.println("Not Prime");
		}
		else{
			for(i=2;i<=m;i++){
				if(n%i==0){
					System.out.println("NotPrime");
					count++;
					break;
					}
			}
			if(count==0){
				System.out.println("Prime");
			}
		}
	}

}
