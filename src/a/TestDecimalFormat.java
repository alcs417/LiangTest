package a;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Formatter;/*�ο�JDK�ĵ���Formatter���Format String Syntax˵����
������System.out.printf��System.out.format;
�����ʽΪ   %[argument_index$][flags][width][.precision]conversion
ͬʱע��String.format����*/

public class TestDecimalFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����  ��Ҫע�����printf���Զ�������������
		System.out.printf("%.2f\n",   2.3356); 
		System.out.printf("%.2f\n",   2.3333);   
        System.out.printf("%-10s%-10s\n",   "ab",   "f1",   "200");//ע�����ֺ�����������д��������  
        //System.out.printf("%10s%10s%10s\n",   "ab",   "f1",   "200");  
        //System.out.printf("%2$-10s%-10s\n",   "ab",   "f1",   "200");
        /*"2$"��ʾѡ�����ĵڼ�����������������������Ȼ��һ��������ʼ���
         * ��"%2$-10s%-10s\n"������ʽ�������Ϊf1        ab          
         * ��Ϊ"3$-10s%-10s\n"������ʽ�������Ϊ200       ab
         * ������Դ�����
         * ע�⣺һ��%��Ӧ����һ������*/
        System.out.printf("%-10s%-10s%-10s\n",   "abc",   "factory",   "200"); 
        
        System.out.printf("%-5d%-5d%-5d%-5d\n",456,76,2345,1);
        System.out.printf("%-10.2f%-10.2f\n",   2.3333,4.55);
        
        //�Ҷ���
        System.out.format("%.2f\n",   2.3333);
        System.out.printf("%10s%10s%10s\n",   "ab",   "f1",   "200"); 
        System.out.printf("%10s%10s%10s\n",   "abc",   "factory",   "200"); 
        //PrintStream ps = new PrintStream();

	}

}
