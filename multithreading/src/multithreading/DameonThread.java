package multithreading;

public class DameonThread  extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
		
	}
	//create daemon thread before starting the thread..

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		DameonThread dt=new DameonThread();
		dt.setDaemon(true);
		dt.start();
		System.out.println("my name is rahul sharma");
		System.out.println("my name is rahul sharma");
		System.out.println("my name is rahul sharma");
		System.out.println("my name is rahul sharma");
		System.out.println(dt.isDaemon());
		
	}

}
