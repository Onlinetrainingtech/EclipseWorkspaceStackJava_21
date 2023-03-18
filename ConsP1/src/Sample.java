class Demo
{
	Demo()
	{
		System.out.println("default cons..");
	}
	Demo(int pid,String pname)
	{
		System.out.println("ParamCons.."+pid+""+pname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		new Demo();
		new Demo(1001,"mobile");

	}

}
