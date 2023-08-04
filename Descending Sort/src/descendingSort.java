import java.util.Scanner;
public class descendingSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b ,c, result;
		
		System.out.println("1st Number: ");
		a = input.nextInt();
		System.out.println("2nd Number: ");
		b = input.nextInt();
		System.out.println("3rd Number: ");
		c = input.nextInt();
		
		if((a >b ) && (a>c)) {
			if(b>c) {
				System.out.println("Sorting: "+ a +" > "+ b + ">" + c);
			}
			else {
				System.out.println("Sorting: "+ a +" > "+ c + ">" + b);
			}
		}
		else if((b>c) &&(b>a)) {
            if (a>c){
                System.out.println("Sıralama : "+ b + " > " + a + " > " + c);
            }else{
                System.out.println("Sıralama : "+ b +" > " + c + " > " + a);
            }
        }else {
            if ((b>a)){
                System.out.println("Sıralama : "+ c + " > " + b + " > " + a);
            }else {
                System.out.println("Sıralama : "+ c + " > " + a + " > " + b);
            }
        }
	}
}
