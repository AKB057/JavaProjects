package BroCodeProjects;


import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimedProgram {
	
	public static void main(String[] args) {
		
		Timer timer= new Timer();

		Calendar date= Calendar.getInstance(); // We are taking the current default time as per the system.
		
		// A Timer Task class is imported and created with anonymous object to schedule an object to run repeatedly with a thread
		TimerTask ttask= new TimerTask() {
			
			int count=10;
			@Override
			public void run() {
				
				if(count>0)
				{ 
					System.out.println(count+" Seconds");
					count--;
				}
				else
				{
					System.out.println("Timer ended and output displayed");
					System.out.println(date.getTime());
					timer.cancel();
				}
			}
		};
		
	//	timer.schedule(ttask, 5000);
		
		date.set(2023, 6, 16,14, 02 , 0);
		
	//	timer.schedule(ttask, date.getTime());
		
		timer.scheduleAtFixedRate(ttask, date.getTime(), 1000);
		
	}

}
