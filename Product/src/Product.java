class Demo
{
	 public void addProduct()
	   {
	      System.out.println("Welcome to addProduct");
	   }
	   public void display()
	   {
	      System.out.println("Display method");
	   }
}
public class Product {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.addProduct();
		f1.display();
	}

}
