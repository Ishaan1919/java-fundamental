import java.util.Scanner;
public class CelsiusToFahrenheitConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Celsius value: ");
		
		double Celsius = sc.nextDouble();
		double Fahrenheit = (double)(Celsius * 9/5) + 32;
		System.out.print("Value of Fahrenheit " + Fahrenheit);
	}
}