class Foo
{
	
	void fun1(int cid,String cname)
	{
		System.out.println("Your cid is::"+cid+"Your cname is::"+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.fun1(1001,"mobile");

	}

}
