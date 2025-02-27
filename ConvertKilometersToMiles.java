import java.util.Scanner;

public class ConvertKilometersToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of Kilometers: ");
		double Kilometers = sc.nextDouble();
		
		double miles = Kilometers * 0.621371;
		
		System.out.print("The coverted value of Kilometers to miles is " + miles);
	}
}