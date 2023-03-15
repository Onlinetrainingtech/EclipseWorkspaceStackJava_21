class Demo
{
	void get1(int pid)
	{
		System.out.println("Your pid is::"+pid);
	}
	void get1(int cid,String cname)
	{
		System.out.println("Your cid::"+cid+"Your cname::"+cname);
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1(1001);
		t1.get1(2001,"mobile");

	}

}
