interface B
{
	int pid=1001;
	void get1();
}
class Demo implements B
{
	public void get1()
	{
		System.out.println("Your Pid is::"+pid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
