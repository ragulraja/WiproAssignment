package WiproAssignment2;

import java.util.Scanner;

public class Flow4 {

	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character");
		char a = scan.next().charAt(0);
		char b = scan.next().charAt(0);
		if(a<b){
			System.out.println(a+ "," +b);
		}
		else{
			System.out.println(b+ "," +a);
		}
		
	}

}
