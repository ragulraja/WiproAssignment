package WiproAssignment2;

import java.util.Scanner;

public class Array9 {
	public static void main(Stringsash[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array:");
			int n=scan.nextInt();
			int[] ar=new int[n];
			int sum=0;
			System.out.println("Enter elements for the array");
			for(int i=0;i<n;i++)
				ar[i]=scan.nextInt();
			for(int i=0;i<n;i++)
			{
				if(ar[i]==6)
				{
					for(int j=i+1;j<n;j++)
						if(ar[j]==7)
							for(int k=j;k>=i;k--)
								ar[k]=0;
		}
				sum=sum+ar[i];
		}
			System.out.println(sum);
			scan.close();
		
}
}
