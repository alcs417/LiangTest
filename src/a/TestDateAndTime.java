package a;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;

//java.util包和sun.util包有什么不同
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.CalendarUtils;
//import sun.util.calendar.BaseCalendar.Date;

public class TestDateAndTime {

	/**
	 * @param args
	 */
	
	
	
	 public void Date(int year, int month, int date, int hrs, int min, int sec) {
	      int y = year + 1900;
	      // month is 0-based. So we have to normalize month to support Long.MAX_VALUE.
	      if (month >= 12) {
	        y += month / 12;
	        month %= 12;
	      } else if (month < 0) {
	        y += CalendarUtils.floorDivide(month, 12);
	        month = CalendarUtils.mod(month, 12);
	      }


	      /*BaseCalendar cal = getCalendarSystem(y);
	      cdate = (BaseCalendar.Date) cal.newCalendarDate(TimeZone.getDefaultRef());
	      cdate.setNormalizedDate(y, month + 1, date).setTimeOfDay(hrs, min, sec, 0);
	      getTimeImpl();
	      cdate = null;*/
	    }

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int date = Date.FIELD_UNDEFINED;
		System.out.print("\nthe date is: " + date);*/
		
		Calendar ca = Calendar.getInstance(); 
		//引入java.util.Date后就不用写成java.util.Date now = ca.getTime();这种形式了
	    //直接写成Date now = ca.getTime();就可以了  
		//记住，同时引入java.util.Date和sun.util.calendar.BaseCalendar.Date;是有问题的，编译器会不知道该去哪个
		//Date包中寻找Date类，注意，在别人的机子上，即使同时引入java.util.Date和sun.util.calendar.BaseCalendar;
		//也是不可以的，难道JDK的版本不同会产生很大的编译区别？
		java.util.Date now = ca.getTime(); 
		System.out.println("now is: " + now);
		
		ca.add(Calendar.DAY_OF_MONTH,7); 
		java.util.Date fu = ca.getTime(); 
		System.out.println("fu is: " + fu);
		
		//也有DateFormat
		SimpleDateFormat sdf = new SimpleDateFormat( "MM/dd/yyyy HH:mm "); 

		System.out.println(sdf.format(new java.util.Date())); 
		
		java.util.Date temp = new java.util.Date();
		long time = temp.getTime();
		System.out.println("the time is : " + time);//这个值返回的跟System.currentTimeMillis()一样
		
		//汗死，直接输出以下语句，就能得到当前日期和时间
		System.out.println(new java.util.Date());

		
		//BaseCalendar是怎么用的？我在JDK1.6中没有找到关于BaseCalendar的内容。可以仔细看下Calendar吧。
		int date = Calendar.DATE;
		System.out.println("the test date is: " + date);
		//BaseCalendar bc = new BaseCalendar();
		
		
		
	}

}
