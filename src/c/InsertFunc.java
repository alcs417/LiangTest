package c;

public class InsertFunc {

	/**
	 * @param args
	 */
	
	/*public static String insert(int pos,String insertStr,String originStr)
	{
		//��insertStr���뵽����originStr��posλ��
		
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
		return originStr;//���������String����ֵ�Ļ����ǲ���ı䴫��Ĳ���originStr��ֵ��
		                 //���ٴ�֤����Java���˶��������⣬��û�а취ͨ�������ú������εķ�ʽ���ı��������ж�Ӧԭʼ
		                 //�������͵�ֵ�ġ�����Ӧ���ǿ��Եģ�Javaһ�нԶ�����ʵ����Javaһ�н�ָ�롣
	}*/
	
	public static void insert(int pos,String insertStr,TestString ts)
	{
		//��insertStr���뵽����originStr��posλ��
		
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
		//return originStr;//���ö��������һ�£���Ȼ������û������ģ���ֻҪ���Ĳ����ǻ������������ͣ�������
		                   //ԭʼ�������ͣ���û�а취���������иı���ε�ֵ��ע�Ⱑע�⡣
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

