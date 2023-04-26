import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers to Swap: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int num3 = num1 + num2;
		num1 = num3 - num1;
		num2 = num3 - num2;
		System.out.println(num1 +" "+ num2);
	}

}
