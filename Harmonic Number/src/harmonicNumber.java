import java.util.Scanner;
public class harmonicNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = s.nextInt();
		
		double sum = 0;
		
		if(number > 0) {
			for(int i =1; i <= number; i++) {
				sum += Math.pow(i, -1);
			}
			System.out.println("sum\n" + sum );
		}
		else {
			System.out.println("Enter a valid value");
		}

	}

}
