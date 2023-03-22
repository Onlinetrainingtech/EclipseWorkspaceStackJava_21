class Demo
{
	void get1()
	{
		try
		{
		int a=100/0;
		System.out.println("Your data is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println(t);
		}
		finally
		{
			get2();
		}
		
	}
	void get2()
	{
		try
		{
		String s1=null;
		
		System.out.println("Get-2 is a function..."+s1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println(t);
		}
	}

}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		//f1.get2();

	}

}
