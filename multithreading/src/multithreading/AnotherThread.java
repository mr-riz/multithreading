package multithreading;
public class AnotherThread extends Thread{
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println("value of another i="+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			
			
		}
	}
	
}