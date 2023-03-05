import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void get1() throws IOException
	{
		System.out.println("Enter the value is::");
		empid=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
	}
	void get2()
	{
		System.out.println("Your empid is::"+empid+"Your empname is::"+empname);
		
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
