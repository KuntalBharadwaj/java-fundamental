import java.util.Scanner;
import java.lang.Math.*;

class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle");
		double radius = sc.nextDouble();
		
		System.out.print("Area of the Circle is : ");
		System.out.print(Math.PI*(radius*radius));
	}
}