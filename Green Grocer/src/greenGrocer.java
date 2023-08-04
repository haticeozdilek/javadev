import java.util.Scanner;
public class greenGrocer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.00;
		
		System.out.println("Write down how many kg of pears you want: ");
		double pKg = s.nextDouble();
		
		System.out.println("Write down how many kg of apples you want: ");
		double aKg = s.nextDouble();
		
		System.out.println("Write down how many kg of tomatoes you want: ");
		double tKg = s.nextDouble();
		
		System.out.println("Write down how many kg of bananas you want: ");
		double bKg = s.nextDouble();
		
		System.out.println("Write down how many kg of aubergines you want: ");
		double auKg = s.nextDouble();

		double pPrice= pKg*pear,aPrice=aKg*apple, tPrice=tKg*tomato ,bPrice=bKg*banana,auPrice=auKg*aubergine;
        double sum=pPrice+aPrice+tPrice+bPrice+auPrice;
        
        System.out.println("Pear: "+pPrice+"TL"+"\nApple: "+aPrice+"TL"+"\nTomato: "+tPrice+"TL"+"\nBanana: "
                +bPrice+"TL"+"\nAubergine: "+auPrice+"TL"+"\nSum: "+sum+"TL");
	}

}
