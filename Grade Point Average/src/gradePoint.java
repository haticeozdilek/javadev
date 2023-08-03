import java.util.Scanner;

public class gradePoint {
	//If ve else kullanmadan boolean situation yazarak Sınıfı geçip geçmediğini yazdırmış oldum.

	public static void main(String[] args) {
		int math, physic, chemistry, turkish, history, music;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Math grade: ");
		math = input.nextInt();
		
		System.out.println("Physic grade: ");
		physic = input.nextInt();
		
		System.out.println("Chemistry grade: ");
		chemistry = input.nextInt();
		
		System.out.println("Turkish grade: ");
		turkish = input.nextInt();
		
		System.out.println("History grade: ");
		history = input.nextInt();
		
		System.out.println("Music grade: ");
		music = input.nextInt();
		
		average = (math + physic + chemistry + turkish + history + music)/6.0;
		System.out.println("Average :" +average);
		
		boolean situation = (average>=60);
		
		String result = situation ? "You passed the class" : "You failed the class";
		System.out.println(result);
	}

}
