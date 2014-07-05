package a;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
//import java.util.Date;

/*import sun.util.calendar.BaseCalendar;
import sun.util.calendar.CalendarUtils;*/
//import sun.util.calendar.BaseCalendar.Date;


public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Calendar ca = Calendar.getInstance();
		java.util.Date now = ca.getTime(); 
		System.out.println("now is: " + now);
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL); 

		GregorianCalendar cal = new GregorianCalendar(); 

		cal.setTime(new Date()); 

		System.out.println("System Date: " + dateFormat.format(cal.getTime()));*/
		
		Date date = new Date();
		Calendar cal = Calendar.getInstance();   
		cal.setTime(date);
		cal.set(Calendar.YEAR, 2006);   
		cal.set(Calendar.MONTH, 8);   
		cal.set(Calendar.DAY_OF_MONTH, 3);   
		//SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
		System.out.println(df.format(cal.getTime()));  


	}

}
