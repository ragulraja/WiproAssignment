package WiproAssignment2;

import java.util.Scanner;

public class Array2 {
		public static void main(Stringsash[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter The Array Size:");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter The Array Value:");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextInt();
				}
			int max=arr[0];
			int min=arr[0];
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]>max){
					max=arr[i];
				}
				if(arr[i]<min){
				min = arr[i];
				}
				}
				System.out.println("Largest Number in a given array is :" + max);
				System.out.println("Smallest Number in a given array is : " + min);
				scan.close();
				}
				}
				
				