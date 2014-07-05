package toOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class testToOne {

	/**
	 * @param args
	 */
	
	private static ArrayList<double[]> source = new ArrayList<double[]>();
	
	public static void dealData(String[] tmp)
	{
		double[] shuzu = new double[tmp.length];
		double minValue,maxValue;//归一化函数采用y=(x-MinValue)/(MaxValue-MinValue)
		minValue = maxValue = Double.valueOf(tmp[0]);
		for(int i = 0;i < tmp.length;i++)
		{
			shuzu[i] = Double.valueOf(tmp[i]);
			if(shuzu[i] < minValue)
			{
				minValue = shuzu[i];
			}
			else if(shuzu[i] > maxValue)
			{
				maxValue = shuzu[i];
			}
		}
		//System.out.println("the maxValue is:" + maxValue + " the minValue is:" + minValue);
		for(int i = 0;i < shuzu.length;i++)
		{
			shuzu[i] = (shuzu[i] - minValue)/(maxValue - minValue);
			//System.out.println("the shuzu[" + i + "] is:" + shuzu[i]);
			//shuzu[i] = Math.log10(shuzu[i]);//这里采用y=log10(x)的归一化函数，这个函数不行，有可能产生大于1的值。
		}
		source.add(shuzu);
	}
	
	public static void dataOutput()
	{
		String s = "outputData.txt";
		try
		{
		    //FileWriter fos = new FileWriter(new File(s));
			DecimalFormat df = new DecimalFormat("0.00000");
			FileOutputStream fos = new FileOutputStream(new File(s));
			for(int i = 0;i < source.size(); i++)
			{
				for(int j = 0;j < source.get(i).length;j++)
				{
					fos.write(String.valueOf(df.format(source.get(i)[j])).getBytes());
					fos.write(",".getBytes());
					
				}
				fos.write("\n".getBytes());
			}
			fos.flush();
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*double minValue = 0.994367,maxValue = 1.0;
		double x = 0,y = 0,tmp = 0;
		tmp = (0.996658 - minValue)/(maxValue - minValue);
		System.out.println("tmp is " + tmp);*/
		try
		{
		    String file = "inputData.txt";
		    String s = null;
		    BufferedReader br = new BufferedReader(new FileReader(file));
		    while( (s = br.readLine()) != null)
		    {
		    	String[] tmp;
		    	tmp = s.split(" ");
		    	//source.add(tmp);
		    	dealData(tmp);
		    }
		    //testToOne.dataOutput();
		    dataOutput();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.err.print("Error!");
		}

	}

}
