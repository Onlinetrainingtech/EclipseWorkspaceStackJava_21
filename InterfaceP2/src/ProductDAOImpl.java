
public class ProductDAOImpl implements ProductDAO
{

	public void addProduct() {
		
		System.out.println("This is the addProduct");
		
	}

	public void viewProduct(ProductModel p) {
		
		System.out.println("This is view Product::"+p.getPid()+""+p.getPname());
		
	}

}
