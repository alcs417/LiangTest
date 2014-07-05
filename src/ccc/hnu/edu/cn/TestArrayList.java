package ccc.hnu.edu.cn;

import java.util.ArrayList;

class TestClass
{
	int i = 1;
	String j = "Hello";
}

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList<TestClass> a = new ArrayList<TestClass>();
		ArrayList<TestClass> b = new ArrayList<TestClass>();
		a.add(new TestClass());
		b.add(a.get(0));
		
		System.out.println(a.get(0).i + "  " + a.get(0).j);
		//System.out.println(b.get(0));
		
		TestClass temp = b.get(0);
		temp.i = 4;
		temp.j = "Bye";
		
		//b.remove(0);
		
		System.out.println(a.get(0).i + "  " + a.get(0).j);*/
		//System.out.println(b.get(0).i + "  " + b.get(0).j);
		//System.out.println(b.get(0));
		
		/*ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(123);
		b.add(a.get(0));
		
		System.out.println(a.get(0));
		//System.out.println(b.get(0));
		
		Integer temp = b.get(0);
		temp = 456;
		
		b.remove(0);*/
		
		//System.out.println(a.get(0));
		//System.out.println(b.get(0));
		//System.out.println(b.get(0).i + "  " + b.get(0).j);
		//System.out.println(b.get(0));
		
		ArrayList<TestClass> a = new ArrayList<TestClass>();
		
		TestClass temp = new TestClass();
		
		a.add(temp);
		//a.remove(0);
		
		temp.i = 4;
		temp.j = "Bye";
		
		//System.out.println(temp.i + " " + temp.j);
		System.out.println(a.get(0).i + " " + a.get(0).j);
		
	}

}
