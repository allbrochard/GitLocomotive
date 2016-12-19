import java.util.Scanner;
// encoder en UTF8

public class main2 {

	private static Scanner sc;
	
	
	public static void main(String[] args) {
		//do you need a doctor ? 
		//trust your doctor !!

		
	int a,b,c;
	
	sc = new Scanner(System.in);
	
	System.out.println("What's u'r first number ? ");
	a = sc.nextInt();
	
	System.out.println("second number ? ");
	b = sc.nextInt();
	
	c=a-b;
	
	if (Math.abs(c)<2) {
		System.out.println("True");
		
	}
	else 
		System.out.println("false");
	
	

		
	}
}
