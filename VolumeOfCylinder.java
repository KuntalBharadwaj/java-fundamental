import java.util.Scanner;
import java.lang.Math.*;

class VolumeOfCylinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Cylinder");
		double radius = sc.nextDouble();
		
		System.out.println("Enter the Height of Cylinder");
		double height = sc.nextDouble();
		
		System.out.print("Area of the Cylinder is : ");
		System.out.print(Math.PI*(radius*radius)*height);
	}
}