import java.util.HashMap;
import java.util.Map;

class Demo
{
	HashMap<Integer,String>list1=new HashMap<Integer,String>();
	void get1()
	{
		list1.put(1001,"azar");
		list1.put(1002,"mohamed");
		list1.put(1003,"raja");
		
		for(Map.Entry h1:list1.entrySet())
		{
			System.out.println(h1.getKey());
			System.out.println(h1.getValue());
		}
		
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.containsKey(1001));
		System.out.println(list1.remove(1002));
		System.out.println(list1.size());
		System.out.println(list1.containsKey(1002));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1();

	}

}
