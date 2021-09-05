package multithreading;
public class CreatingThread implements Runnable{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i="+i);
			try {
				Thread.sleep(1000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
				
			}
			
			
			
		}
		
	}
	public static void main(String[] args)
	{
		CreatingThread th1=new CreatingThread();
		AnotherThread at=new AnotherThread();
		Thread thread=new Thread(th1);
		thread.start();
		at.start();
		
		
		
	}
}