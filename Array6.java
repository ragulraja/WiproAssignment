package WiproAssignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
	
		public static void main(Stringsash[] args) {
	// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter The Array Size:");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter The Array Values:");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextInt();
			}
			for (int i = 0; i < arr.length; i++) {
				Arrays.sort(arr);
			}System.out.println("Sort Array Is="+Arrays.toString(arr));
			scan.close();
	}
		
	}

