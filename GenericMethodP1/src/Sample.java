class Demo
{
	 public <M> M test(M t)
	 {
		 return t;
	 }
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		System.out.println(g1.test(1001));
		System.out.println(g1.test("Azar"));
		System.out.println(g1.test(15.4));

	}

}
