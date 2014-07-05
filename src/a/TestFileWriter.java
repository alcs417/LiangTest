package a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import sun.util.calendar.BaseCalendar.Date;

public class TestFileWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temp = new double[2];
		temp[0] = 1.55;
		temp[1] = 2.34;
		String s = "test.txt";
		try
		{
		    /*BufferedWriter bw = new BufferedWriter(new FileWriter(s));
		    bw.write(String.valueOf(temp[0]) + "," + String.valueOf(temp[1]));
		    bw.write("\n");
		    bw.newLine();
		    bw.write(String.valueOf(temp[1]));
		    bw.close();*/
		    
		    /*FileOutputStream fos = new FileOutputStream(new File(s));
		    fos.write((String.valueOf(temp[0]) + " 1").getBytes("UTF-8"));
		    fos.write("\n".getBytes());
		    fos.write(String.valueOf(temp[1]).getBytes());
		    fos.close();*/
		    
		    /*FileWriter fw = new FileWriter(new File(s));
		    fw.write("abc" + "123");
		    fw.write("\n");
		    fw.close();*/
			
			/*FileOutputStream fos = new FileOutputStream("test.txt",true);
			fos.write("test FileOutputStream".getBytes());
		    fos.close();*/
		    
			long begin = System.currentTimeMillis();//注意还有Date的用法
			FileWriter fw = new FileWriter("test.txt",true);
			fw.write("test FileWriter");
			fw.close();
			long end = System.currentTimeMillis();
			System.out.println("The executing time is: " +  (end - begin));
			
			
		    System.out.println("Run Success!");
		}
		catch(IOException e)
		{
			System.err.println("Error!");
			e.printStackTrace();
		}

	}

}
