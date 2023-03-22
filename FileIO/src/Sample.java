import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Demo
{
	void writeData() throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("D:\\v1.txt"))
		{
			int i;
			String name="mohamed";
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("DataInserted..");
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		f1.writeData();

	}

}
