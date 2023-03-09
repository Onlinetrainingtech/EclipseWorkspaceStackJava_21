import java.util.Scanner;

class Demo
{
	int age,sal,bns;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the age is::");
		age=sc.nextInt();
	}
	void get2()
	{
		if(age>=60)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=10000)
			{
				bns=sal+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low..");
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
