class B
{
	int cid=1001;
	void get1()
	{
		System.out.println("This is the base class");
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("This is the dervied class::"+cid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
