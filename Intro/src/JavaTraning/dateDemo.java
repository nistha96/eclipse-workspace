package JavaTraning;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// current date/ current time 
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
	}

}
