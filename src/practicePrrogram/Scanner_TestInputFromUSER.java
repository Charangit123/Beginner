package practicePrrogram;
import java.util.Scanner;

public class Scanner_TestInputFromUSER {
	
	public static void main(String[] args) {
		int i=23;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name?");
		String name =sc.nextLine();
		System.out.println("Hello	" +name);

		System.out.println("Waht is your age?");
		int age=sc.nextInt();
		System.out.println("Your age is :" + --age + " one year back ");
		
		sc.close();
		System.out.print("this is defibned int t"
				+ "" +i);
		
	}
	
}
