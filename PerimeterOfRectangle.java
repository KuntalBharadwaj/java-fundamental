import java.util.Scanner;

class PerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length");
		Float length = sc.nextFloat();
		
		System.out.println("Enter the Width");
		Float width = sc.nextFloat();
		
		float perimeter = 2*(length + width);
		
		System.out.print("Perimeter of the Rectangle is : ");
		System.out.print(perimeter);
	}
}