package a;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Formatter;/*参看JDK文档中Formatter类的Format String Syntax说明，
适用于System.out.printf及System.out.format;
输出格式为   %[argument_index$][flags][width][.precision]conversion
同时注意String.format方法*/

public class TestDecimalFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//左对齐  需要注意的是printf会自动进行四舍五入
		System.out.printf("%.2f\n",   2.3356); 
		System.out.printf("%.2f\n",   2.3333);   
        System.out.printf("%-10s%-10s\n",   "ab",   "f1",   "200");//注意这种和下面这两种写法的区别  
        //System.out.printf("%10s%10s%10s\n",   "ab",   "f1",   "200");  
        //System.out.printf("%2$-10s%-10s\n",   "ab",   "f1",   "200");
        /*"2$"表示选择后面的第几个参数进行输出，其余的依然第一个参数开始输出
         * 如"%2$-10s%-10s\n"这种形式，输出即为f1        ab          
         * 若为"3$-10s%-10s\n"这种形式，输出即为200       ab
         * 其余的以此类推
         * 注意：一个%对应后面一个参数*/
        System.out.printf("%-10s%-10s%-10s\n",   "abc",   "factory",   "200"); 
        
        System.out.printf("%-5d%-5d%-5d%-5d\n",456,76,2345,1);
        System.out.printf("%-10.2f%-10.2f\n",   2.3333,4.55);
        
        //右对齐
        System.out.format("%.2f\n",   2.3333);
        System.out.printf("%10s%10s%10s\n",   "ab",   "f1",   "200"); 
        System.out.printf("%10s%10s%10s\n",   "abc",   "factory",   "200"); 
        //PrintStream ps = new PrintStream();

	}

}
