import java.util.Scanner;

class CovertKilometertoMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter kilometer");
		double kilo = sc.nextDouble();
		
		double miles = kilo * 0.621371;
		
		System.out.print(miles);
	}
}