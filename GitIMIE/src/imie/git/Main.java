package imie.git;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hey Allan !!!");
		System.out.println("Ca c'est un chat next gen !");

		Calendar date = new GregorianCalendar();
		System.out.println(date.getTime());
		
		int fin = date.get(Calendar.SECOND) + 10;
		//while (date.get(Calendar.SECOND)<fin){
			System.out.println(date.get(Calendar.SECOND));
		//}
		

	}

}