import java.util.Scanner;
public class bodyMassIndex {
//Formula: Weight (kg) / Height(m) * Height(m)
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms: ");
		double weight = s.nextDouble();
		System.out.println("Enter your height in meters");
		double height = s.nextDouble();
		double bMassIndex = weight/(height*height);
		System.out.println("Your Body Mass Index: " +bMassIndex);

	}

}
