package f;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Qunshuo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串数字:");
		String temp = sc.nextLine();
		System.out.println(temp);*/
		/*BufferedInputStream br = new BufferedInputStream(System.in);
		try 
		{			
			String temp = "";
			int s;
			//while((s = br.read()) != -1)
			while((s = br.read()) != '\r')//在程序中回车是'\r\n'，但是怎么不能用-1为作为结束输入的条件呢
			{
				temp = temp + (char)s;
			}
			System.out.println(temp);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*InputStreamReader isr = new InputStreamReader(System.in);
		try 
		{			
			String temp = "";
			int s;
			//while((s = br.read()) != -1)
			while((s = isr.read()) != '\r' )//在程序中回车是'\r\n'，但是怎么不能用-1为作为结束输入的条件呢
			{
				temp = temp + (char)s;
			}
			System.out.println(temp);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
