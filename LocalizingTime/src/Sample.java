import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample {

	public static void main(String[] args) {
		DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL,new Locale("de","DE"));
		String d1=df.format(new Date());
        System.out.println(d1);


	}

}
