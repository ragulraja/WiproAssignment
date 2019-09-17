package WiproAssignment2;

public class Flow6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = args[0];
		int age = 1;
		int b = Integer.parseInt(args[1]);
		if(args[0].equals("female")){
			if(age >=1 && age <=58){
				System.out.println("intrest 8.2");
		}
		}
		if(args[0].equals("female")){
			if(age>=59 && age <=120){
				System.out.println("Intrest 7.6");
			}
		}
		if(args[0].equals("male")){
			if(age>=1 && age <=60){
				System.out.println("Intrest 9.2");
			}
		}
		if(args[0].equals("male")){
			if(age>=61 && age <=120){
				System.out.println("Intrest 8.3");
			}
		}
		else{
			System.out.println("Invalid Characters");
		}
		}
	}

