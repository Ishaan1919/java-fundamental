import java.util.Scanner;

public class CalculateSimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of Principle: ");
		Float Principal = sc.nextFloat();
		
		System.out.print("Enter the value of Rate: ");
		Float Rate = sc.nextFloat();
		
		System.out.print("Enter the value of Time: ");
		Float Time = sc.nextFloat();
		
		Float SimpleInterest = (Principal * Rate * Time) / 100;
		
		System.out.print("Value of Simple Interest is " + SimpleInterest);
	}
}