import java.util.Scanner;

class CelsiusToFarenheiteConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Celcius Value");
		double celcius = sc.nextDouble();
		
		double farenheit = (celcius * 9/5) + 32;
		System.out.println(farenheit);
		
	}
}