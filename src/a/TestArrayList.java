package a;

import java.util.ArrayList;

class obj
{
	public String aa;
	public int cc;
}

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
	    /*String a = "abc",b;
	    al.add(a);
	    b = (String)al.get(0);
	    System.out.println("b = " + b);
	    b = "123";
	    System.out.println("a = " + al.get(0));
	    System.out.println("b = " + b);*/
	    
	    /*obj n = new obj();
	    obj m = null;
	    n.aa = "aaa";
	    n.cc = 1;
	    al.clear();
	    al.add(n);
	    m = (obj)al.get(0);
	    m.aa = "mmm";
	    m.cc = 2;
	    System.out.println("n = " + n.aa);
	    System.out.println("al = " + ((obj)al.get(0)).aa);*/
		
		/*obj n = new obj();
	    obj m = new obj();
	    n.aa = "aaa";
	    n.cc = 1;
	    al.clear();
	    al.add(n);
	    m = (obj)al.get(0);
	    n.aa = "mmm";
	    n.cc = 2;
	    System.out.println("m = " + m.aa);
	    System.out.println("al = " + ((obj)al.get(0)).aa);*/
		
		Integer a = 1,b;
	    al.add(a);
	    b = (Integer)al.get(0);
	    System.out.println("b = " + b);
	    b = 2;
	    System.out.println("a = " + al.get(0));
	    System.out.println("b = " + b);

	}

}
