package ifelsestmtp1;

import java.util.Scanner;

class Demo
{
	int pid;
	String uname,pass;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the pid is::");
		pid=sc.nextInt();
		
		if(pid==1001)
		{
			System.out.println("Your pid is equal");
		}
		else
		{
			System.out.println("Your pid is not equal");
		}
	}
	void get2()
	{
		System.out.println("Enter the username and password::");
		uname=sc.next();
		pass=sc.next();
		if(uname.equals("admin")&&pass.equals("admin@123"))
		{
			System.out.println("LoginSucess!!!");
		}
		else
		{
			System.out.println("LoginFail!!");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
