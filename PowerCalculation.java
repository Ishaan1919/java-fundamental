import java.util.Scanner;
import java.lang.Math.*;

public class PowerCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of number: ");
		double number = sc.nextDouble();
		
		System.out.print("Enter the value of power: ");
		double power = sc.nextDouble();
		
		
		double result = Math.pow(number,power);
		
		System.out.print("The power of number is " + result);
	}
}