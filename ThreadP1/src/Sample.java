
class Demo extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("Welcome to the Thread...");
		Thread.sleep(10000);
		get1();
		}
		catch(InterruptedException t)
		{
			
		}
	}
	
	void get1()
	{
		System.out.println("ThreadName::"+currentThread().getName());
		System.out.println("Priority::"+currentThread().getPriority());
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		//Demo t2=new Demo();
		t1.start();
		t1.setName("pavan");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.isAlive());
		//t2.start();
		

	}

}
