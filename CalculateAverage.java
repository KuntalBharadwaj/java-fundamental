import java.util.Scanner;

class CalculateAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		int a1 = sc.nextInt();
		
		System.out.println("Enter the second Number");
		int a2 = sc.nextInt();
		
		System.out.println("Enter the third Number");
		int a3 = sc.nextInt();
		
		int result = (a1+a2+a3)/3;
		
		System.out.print("The Average of 3 Numbers is : ");
		System.out.print(result);
	}
}