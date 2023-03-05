class Demo
{
	int empid=1001;//class or instance
	void get1()
	{
		String empname="azar";//local variable
		System.out.println("EmployeeName is::"+empname);
	}
	void get2()
	{
		System.out.println("Empid is::"+empid);
	}
}
public class Sample {

	public static void main(String[] args) {
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
