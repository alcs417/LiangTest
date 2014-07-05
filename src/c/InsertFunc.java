package c;

public class InsertFunc {

	/**
	 * @param args
	 */
	
	/*public static String insert(int pos,String insertStr,String originStr)
	{
		//把insertStr插入到序列originStr的pos位置
		
		if(pos < 0 || pos > originStr.length())
		{
			System.out.println("Please reinsert the pos!");
			System.exit(0);
		}
		else if(pos == 0)
		{
			originStr = insertStr + originStr;
		}
		else if(pos == originStr.length())
		{
			originStr = originStr + insertStr;
		}
		else
		{
			String temp1 = "", temp2 = "";
			temp1 = originStr.substring(0, pos);
			temp2 = originStr.substring(pos, originStr.length());
			originStr = temp1 + insertStr + temp2;
		}
		return originStr;//如果不返回String类型值的话，是不会改变传入的参数originStr的值。
		                 //这再次证明了Java除了对象类型外，是没有办法通过给调用函数传参的方式来改变主函数中对应原始
		                 //数据类型的值的。对象应该是可以的，Java一切皆对象，其实就是Java一切皆指针。
	}*/
	
	public static void insert(int pos,String insertStr,TestString ts)
	{
		//把insertStr插入到序列originStr的pos位置
		
		if(pos < 0 || pos > ts.originStr.length())
		{
			System.out.println("Please reinsert the pos!");
			System.exit(0);
		}
		else if(pos == 0)
		{
			ts.originStr = insertStr + ts.originStr;
		}
		else if(pos == ts.originStr.length())
		{
			ts.originStr = ts.originStr + insertStr;
		}
		else
		{
			String temp1 = "", temp2 = "";
			temp1 = ts.originStr.substring(0, pos);
			temp2 = ts.originStr.substring(pos, ts.originStr.length());
			ts.originStr = temp1 + insertStr + temp2;
		}
		//return originStr;//又用对象测试了一下，果然对象是没有问题的，但只要传的参数是基本的数据类型，即六种
		                   //原始数据类型，就没有办法在主函数中改变入参的值。注意啊注意。
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "hahaha";
		TestString s = new TestString("hahaha");
		/*s = insert(0,"wo",s);
		System.out.println(s);*/
		
		/*s = insert(6,"wo",s);
		System.out.println(s);*/
		
		insert(5,"wo",s);
		System.out.println(s.originStr);

	}

}


class TestString
{
	public String originStr;
	public TestString(String originStr)
	{
		this.originStr = originStr;
	}
}

