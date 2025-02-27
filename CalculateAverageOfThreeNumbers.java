import java.util.Scanner;

public class CalculateAverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of number1: ");
		double number1 = sc.nextDouble();
		
		System.out.print("Enter the value of number2: ");
		double number2 = sc.nextDouble();
		
		System.out.print("Enter the value of number3: ");
		double number3 = sc.nextDouble();
		
		double average = (number1+number2+number3)/3;
		
		System.out.print("The average of the 3 numbers is " + average);
	}
}