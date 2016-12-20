package imie.git;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hey Allan !!!");
		System.out.println("Ca c'est un chat next gen !");

		Calendar date = new GregorianCalendar();
		Calendar date2;
		System.out.println(date.getTime());
		date = new GregorianCalendar();
		int fin = date.get(Calendar.SECOND) + 10;
		while (date.get(Calendar.SECOND)<fin){
			date = new GregorianCalendar();
			date2 = new GregorianCalendar();
			System.out.println(date2.get(Calendar.SECOND));
		}
		

	}

}