interface B1
{
	int empid=2001;
	void fun1();
}
interface B2 extends B1
{
	String empname="azar";
	void fun2();
}
class Demo1 implements B2
{

	public void fun2() {
		System.out.println("Function-2::"+empid);
	}

	public void fun1() {
		System.out.println("Function-3::"+empname);
		
	}
	
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
