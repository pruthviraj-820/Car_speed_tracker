import java.util.Scanner;

 class Car_speed_tracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Distence(km) :- ");
		int distance = sc.nextInt();
		
		System.out.print("Enter time taken(hr) :- ");
		float time = sc.nextFloat();
		
		float speed ;
		if(time != 0) {
			 speed = (distance/time);
			 System.out.print("Speed is :- "+speed+" km/h");
		}
		else System.out.println("Enter valid time");
		
	}

}