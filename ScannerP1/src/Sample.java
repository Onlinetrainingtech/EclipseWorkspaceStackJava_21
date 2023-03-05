import java.util.Scanner;

class Demo
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		empid=sc.nextInt();
		System.out.println("Enter the empname is::");
		empname=sc.next();
		
	}
	void get2()
	{
		System.out.println("Your empid is::"+empid+"Your empname is::"+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		g1.get1();
		g1.get2();

	}

}
