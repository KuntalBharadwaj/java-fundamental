import java.util.Scanner;

class AddTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int a2 = sc.nextInt();
		System.out.println("The Sum of Two Number");
		System.out.print(a1+a2);
	}
}