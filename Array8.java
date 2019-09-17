package WiproAssignment2;

import java.util.*;

public class Array8 {
	
	public static void main(Stringsash[] args) {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array:");
		int n=scan.nextInt();
		int max, count;
		max = count = 0;
	System.out.println("Enter the elements for array:");
		int[] a= new int[n];
		for (int i = 0; i < n; i++)
			a[i]=scan.nextInt();
		for (int i = 0; i <n; i++) {
			int temp = 0;
			for (int j = 0; j <n; j++) {
				if (a[i] == a[j]) {
					temp++;
				}
	}
			if (temp > count) {
				max = a[i];
				count = temp;
	}
	}
		System.out.println("Highest Number Of Times Repeat Number Is= " + max);
				scan.close();
	}
	}

