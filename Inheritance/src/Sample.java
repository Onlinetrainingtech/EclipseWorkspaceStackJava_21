class B
{
	int empid=1001;
	void get1()
	{
		System.out.println("This is Baseclass..");
	}
}
class D1 extends B
{
	String empname="pavan";
	int salary=10000;
	void get2()
	{
		System.out.println("Your empname is::"+empname);
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your salary is::"+salary);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
