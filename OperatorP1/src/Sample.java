class Demo
{
	
	void ComparisionOperator()
	{
	   int a1=100,b1=200;
	   System.out.println("Lessthan::"+(a1<b1));
	   System.out.println("Greaterthan::"+(a1>b1));
	   System.out.println("EqualTo::"+(a1==b1));
	}
	void LogicalOperator()
	{
		int a2=200,b2=300;
		System.out.println("LogicalAND::"+((a2<b2)&&(b2>a2)));
		System.out.println("LogicalOR::"+((a2>b2)||(b2>a2)));
	}
	void bitwiseOperator()
	{
		int a=2,b=3;
		System.out.println("BitwiseAND::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("LeftShift::"+(a<<1));
		System.out.println("RightShift::"+(a>>1));
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		//t1.ComparisionOperator();
		//t1.LogicalOperator();
		t1.bitwiseOperator();

	}

}
