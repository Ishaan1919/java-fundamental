import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of length: ");
		int length = sc.nextInt();
		
		System.out.print("Enter the value of width: ");
		int width = sc.nextInt();
		
		
		int Perimeter = 2 * (length + width);
		
		System.out.print("Value of Perimeter is " + Perimeter);
	}
}