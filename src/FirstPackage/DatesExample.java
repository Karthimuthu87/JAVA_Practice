package FirstPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesExample {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm");
		String reqFormat =sdf.format(date);
		System.out.println(reqFormat);
			
		
	}

}
