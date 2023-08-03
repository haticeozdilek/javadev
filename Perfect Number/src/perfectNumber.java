import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Please, enter a number:");
		int number = input.nextInt();
		
		for(int i=1; i<number; i++) {
			if(number%i == 0) {
				sum +=i;
			}
		}
		if(sum == 0) {
			System.out.println(number+ "\nIt's a perfect number.");
		}
		else {
			System.out.println( number+ "\nIt's not a perfect number.");
		}

	}

}
