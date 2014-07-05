package ccc.hnu.edu.cn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0.9;
		double b = 62;
		/*System.out.println(" pow(a,b) = " + Math.pow(a, b));
		System.out.println(" pow(b,a) = " + Math.pow(b, a));
		System.out.println("a = " + a);
		System.out.println("b = " + b);*/
		/*double c = 2.8010824348272124E-29/0.9;
		System.out.println("c = " + c);*/
		try
		{
			/*File f1 = new File("output/output.txt");
			File dir = new File("output");
		    if(!dir.exists())
		    {
		    	dir.mkdir();
		    }
		    if(!f1.exists())
		    {
		    	f1.createNewFile();
		    }*/
			File f1 = new File("F:/workspace/javatest/1.txt");
			if(!f1.exists())
		    {
		    	f1.createNewFile();
		    }
		    //File f1 = new File("output.txt");
		    //File f2 = new File("/output");
		    //f1.createNewFile();
		    /*File f2 = new File("input.1");
		    FileReader fr = new FileReader(f2);
		    fr.read();*/
		    /*FileReader fr = null;
		    BufferedReader br = null;
		    if(f2.isDirectory())
		    {
		    	File[] all = f2.listFiles();
		    	for(int i = 0;i < all.length;i++)
		    	{
		    		
		    		fr = new FileReader(all[i]);
		    		br = new BufferedReader(fr);
		    		String s = br.readLine();
		    		if(s != null)
		    		{
		    		    System.out.println(s);
		    		}
		    		br.close();
		    		fr.close();
		    	}
		    }*/
		    //FileInputStream fr = new FileInputStream("3.txt");
		    //fr.read();
		    BufferedWriter bw = new BufferedWriter(new FileWriter("1.txt"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
