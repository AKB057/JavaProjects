package BroCodeProjects;

public class ThreadProgram {
	
	public static void main(String[] args) throws InterruptedException {

		Thread.currentThread().setName("Mainaa");
		
		for(int i=3;i>0;i--)
		{
			System.out.println(i);		
			Thread.sleep(2000);
		}
		System.out.println("Done");
		

		Thread thread1= new Thread();
		
		thread1.start();
		
		System.out.println(thread1.isAlive());
		System.out.println(thread1.getName());
		System.out.println(thread1.getPriority());
		
		System.out.println(Thread.activeCount());
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
