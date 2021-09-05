package multithreading;
public class ThreadMethrods extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("hello you are in run methrod");
		
	}
	
		public static void main(String[] args)
		{
//			System.out.println(Thread.currentThread().getName());
//			Thread.currentThread().setName("katrina thread");
//			System.out.println(Thread.currentThread().getName());
//			System.out.println(Thread.currentThread().getId());
			
			int a=10;
			int b=78;
			int add=a+b;
			System.out.println("progrsm is starting....");
			Thread t=Thread.currentThread();
			String threadName=t.getName();
			
			System.out.println(add);
			System.out.println(threadName);
			t.setName("MyMain");
			System.out.println(t.getName());
			try{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			ThreadMethrods thread=new ThreadMethrods();
			thread.start();
			
			
			
			
			System.out.println("program has ended...");
			System.out.println("RAHUL SHARMA");
			System.out.println(Thread.currentThread().isAlive());
			System.out.println(thread.isAlive());
			
			
		}
	}
