package Thread;

import pageActions.Googlepageactions;

public class thread1 extends Thread {
	
	public String browsername;
	Googlepageactions googlepage;
	
	public  thread1(String threadname,String browsername)
	{
		super(threadname);
		this.browsername = browsername;
		googlepage = new Googlepageactions();
	}
	
	
	@Override
	
	public void run()
	{
		System.out.println("Thread started "+ Thread.currentThread().getName());
		
		try
		{
		  Thread.sleep(2000);
		  googlepage.init(this.browsername);
		  googlepage.googlesearchtest();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			googlepage.teardown();
		}
		
		System.out.println("Thread ended "+ Thread.currentThread().getName());
	}

}
