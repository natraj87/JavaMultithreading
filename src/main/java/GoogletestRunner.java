import Thread.thread1;

public class GoogletestRunner {

	public static void main(String args[])
	{
//		Thread t1 = new thread1("chrome thread","chrome");
//		Thread t2 = new thread1("firefox thread","firefox");
//		
//		System.out.println("Thread started");
//		
//		t1.start();
//		t2.start();
		
		for (int i = 0 ; i < 4; i++)
		{
			new thread1("chrome thread" + i,"chrome").start();
			new thread1("firefox thread" + i,"firefox").start();
		}
	}
}
