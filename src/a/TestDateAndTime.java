package a;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;

//java.util����sun.util����ʲô��ͬ
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
		//����java.util.Date��Ͳ���д��java.util.Date now = ca.getTime();������ʽ��
	    //ֱ��д��Date now = ca.getTime();�Ϳ�����  
		//��ס��ͬʱ����java.util.Date��sun.util.calendar.BaseCalendar.Date;��������ģ��������᲻֪����ȥ�ĸ�
		//Date����Ѱ��Date�࣬ע�⣬�ڱ��˵Ļ����ϣ���ʹͬʱ����java.util.Date��sun.util.calendar.BaseCalendar;
		//Ҳ�ǲ����Եģ��ѵ�JDK�İ汾��ͬ������ܴ�ı�������
		java.util.Date now = ca.getTime(); 
		System.out.println("now is: " + now);
		
		ca.add(Calendar.DAY_OF_MONTH,7); 
		java.util.Date fu = ca.getTime(); 
		System.out.println("fu is: " + fu);
		
		//Ҳ��DateFormat
		SimpleDateFormat sdf = new SimpleDateFormat( "MM/dd/yyyy HH:mm "); 

		System.out.println(sdf.format(new java.util.Date())); 
		
		java.util.Date temp = new java.util.Date();
		long time = temp.getTime();
		System.out.println("the time is : " + time);//���ֵ���صĸ�System.currentTimeMillis()һ��
		
		//������ֱ�����������䣬���ܵõ���ǰ���ں�ʱ��
		System.out.println(new java.util.Date());

		
		//BaseCalendar����ô�õģ�����JDK1.6��û���ҵ�����BaseCalendar�����ݡ�������ϸ����Calendar�ɡ�
		int date = Calendar.DATE;
		System.out.println("the test date is: " + date);
		//BaseCalendar bc = new BaseCalendar();
		
		
		
	}

}
