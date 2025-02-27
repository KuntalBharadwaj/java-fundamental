import java.util.Scanner;

class CalculateSimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principal");
		Float p = sc.nextFloat();
		
		System.out.println("Enter the Rate");
		Float r = sc.nextFloat();
		
		System.out.println("Enter the time");
		Float t = sc.nextFloat();
		
		float Interest = (p*r*t)/100;
		System.out.print("The Simple Intrest is : ");
		System.out.print(Interest);
	}
}