package ccc.hnu.edu.cn;

//�����õ���TestClass������TestArrayList�е�TestClass�࣬��ͬһ��Packageֻ����Ψһһ��������������ܳ�����ͬ��
public class TestClassPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestClass tc = new TestClass();
		TestClass tcPointer = tc;
		tcPointer.i = 4;
		System.out.println(tc.i);
		TestFunc(tc,-1);
		System.out.println(tc.i);
		System.out.println(tcPointer.i);

	}

	//����һ�º�������ʱ����������Ƿ����Ӱ�죬�����Ѿ��Թ��ˣ��ǻ�Ӱ��ԭ�������ֵ������
	//���Բο�Graph&Algorithms������DynamicProgramming���Package�µ�MatrixMultiply����
	//��ʵ֤��������ʱҲ����ָ��Ĵ��ݲ����ģ�����Ҳ��Ӱ��ԭ�ж����ֵ��ֻ�л�����������
	//���ù���������������û��Ӱ��ģ����Ҫ�ر��ע�⡣�����Ǿ仰��JAVAһ�н�ָ�롣
	public static void TestFunc(TestClass objTC, int value)
	{
		objTC.i = value;
	}
	
	
}
