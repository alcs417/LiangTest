package ccc.hnu.edu.cn;

//这里用到的TestClass是来自TestArrayList中的TestClass类，在同一个Package只能有唯一一个类的声明，不能出现相同的
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

	//测试一下函数调用时如果传对象是否会有影响，数组已经试过了，是会影响原有数组的值，具体
	//可以参考Graph&Algorithms工程中DynamicProgramming这个Package下的MatrixMultiply程序
	//事实证明传对象时也是以指针的传递参数的，所以也会影响原有对象的值。只有基本数据型在
	//调用过程中这样传参是没有影响的，这点要特别的注意。还是那句话，JAVA一切皆指针。
	public static void TestFunc(TestClass objTC, int value)
	{
		objTC.i = value;
	}
	
	
}
