package abstractclass;

import java.util.Calendar;
import java.util.Date;

public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1);
		Date d2=new Date(56586878);//unique code
		System.out.println(d2);
		Date d3=new Date(13,2,12);
		System.out.println(d3);
		boolean a1=d3.before(d1);
		int a2=d3.compareTo(d1);
		System.out.println(a2);
		Calendar c1=Calendar.getInstance();
		c1.set(Calendar.MONTH, 11);
		c1.set(Calendar.DATE, 11);
		c1.set(Calendar.YEAR, 2000);
		System.out.println(c1);
		System.out.println(c1.getTime());
		d1.setTime(10000);
		System.out.println(d1);
		
	
	}

}
