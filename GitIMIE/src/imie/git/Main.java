package imie.git;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static int cpt = 10;

	public static void main(String[] args) {
		System.out.println("Hey Allan !!!");
		System.out.println("Ca c'est un chat next gen !");

		Calendar date = new GregorianCalendar();
		Calendar date2;
		System.out.println(date.getTime());

		Timer timer = new Timer();
		
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				System.out.println(cpt);
				cpt--;
				if (cpt == 0){
					timer.cancel();
					System.out.println("BOOM !");
				}
				
			}
		}, 0, 1000);
		
		
		
		//int fin = date.get(Calendar.SECOND) + 10;
		//while (date.get(Calendar.SECOND)<fin){
			//System.out.println(date.get(Calendar.SECOND));
		//}

		
		

	}

}