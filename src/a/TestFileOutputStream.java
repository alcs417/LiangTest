package a;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class TestFileOutputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String rna = "1234";
		String s = "File " + String.valueOf(1);
        //String s = "File" + "1.txt";
		//s = "output/" + s;
		try
		{
		    //FileWriter fos = new FileWriter(new File(s));
			FileOutputStream fos = new FileOutputStream(new File(s));
			DecimalFormat df = new DecimalFormat("0.00000");
			for(int j = 0;j < 3;j++)
			{
				if(j == 0)
				{
		            for(int i = 0;i < rna.length();i++)
		            {
		    	        fos.write(String.valueOf(df.format(0.5)).getBytes());//这里写的不好，如果采用一个二维数组的话，就不用写的这么麻烦了
		    	        fos.write(",".getBytes());
		            }
		            fos.write("\n".getBytes());
				}
				else if(j == 1)
				{
					 for(int i = 0;i < rna.length();i++)
			         {
			    	     fos.write(String.valueOf(df.format(0.4)).getBytes());
			    	     fos.write(",".getBytes());
			         }
					 fos.write("\n".getBytes());
				}
				else if(j == 2)
				{
					 for(int i = 0;i < rna.length();i++)
			         {
			    	     fos.write(String.valueOf(df.format(0.6)).getBytes());
			    	     fos.write(",".getBytes());
			         }
				}
			}
			//fos.flush();
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
