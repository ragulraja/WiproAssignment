package WiproAssignment2;

public class Flow13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		String str="";
		for( i =10;i<=99;i++){
			int count=0;
			for ( j = i; j >= 1; j--) {
				
				if(i%j==0){
				count = count + 1;
				
			}
		}
			if(count==2){
			str=str+i+" ";
			
		}
			
		}
		
		System.out.println(str+" ");
	}

}
