import java.util.Scanner;
import java.lang.Math.*;

class PowerCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base");
		double base = sc.nextDouble();
		
		System.out.println("Enter exponent");
		double exponent = sc.nextDouble();
		
		double result = Math.pow(base,exponent);
		
		System.out.print("The Power is : ");
		System.out.print(result);
	}
}