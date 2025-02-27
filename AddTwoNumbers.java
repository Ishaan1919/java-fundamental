import java.util.Scanner;
public class AddTwoNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		int result = numberOne+numberTwo;
		System.out.print(result);
	}
}