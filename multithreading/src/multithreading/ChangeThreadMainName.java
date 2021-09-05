package multithreading;
public class ChangeThreadMainName{
	
	public static void main(String[] args)
	{
		ChangeThreadMainName th=new ChangeThreadMainName();
		Thread thread=Thread.currentThread();
		System.out.println("current thread="+thread);
		thread.setName("Rahul thread");
		System.out.println("thread name="+thread);
		//change the name of the thread	
		try {
				for(int i=1;i<=10;i++)
				{
					System.out.println("value of i"+i);
					Thread.sleep(1000);
				}
		}
				
			
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
