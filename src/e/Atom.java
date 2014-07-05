package e;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Atom {

	private ArrayList<String> seq;
	private int[][] score;//A,G,C,T,-五个字符形成的打分矩阵
	
	public Atom()
	{
		seq = new ArrayList<String>();
		score = new int[5][5];
		for(int i = 0;i < score.length - 1;i++)
		{
			for(int j = 0;j < score[i].length - 1;j++)
			{
				if(i == j)
				{
				    score[i][j] = 1;
				}
				else
				{
					score[i][j] = -1;
				}
			}
		}
		for(int i = 0;i < score.length;i++)
		{
			score[i][4] = -2;
		}
		for(int j = 0;j < score[0].length;j++)
		{
			score[4][j] = -2;
		}
	}
	
	public void ReadFile()//把需要比对的序列都读到seq中
	{
		try
		{
			String fileName = "inputString.txt";
			String s = null;
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while ((s = br.readLine()) != null) 
			{
				seq.add(s);
			}    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		   
	}
	
	public void Alignment()//将读入的多序列进行两两比对，采用动态规划算法
	{
		for(int i = 0;i < seq.size();i++)
		{
			for(int j = i+1;j < seq.size();j++)
			{
				double[][] route = new double[seq.get(i).length() + 1][seq.get(j).length() + 1];//要加入一行零值和一列零值
				double[][] opera = new double[seq.get(i).length() + 1][seq.get(j).length() + 1];
				for(int m = 0;m < route.length;m++)
				{
					//route[m][0] = -2 * m;//初始化第0列的值
					route[m][0] = 0;
					opera[m][0] = 0;
				}
				for(int n = 0;n < route[0].length;n++)
				{
					//route[0][n] = -2 * n;//初始化第0行的值
					route[0][n] = 0;
					opera[0][n] = 0;
				}
				for(int m = 1;m < route.length;m++)
				{
					for(int n = 1;n < route[m].length;n++)
					{
						if(seq.get(i).charAt(m-1) == seq.get(j).charAt(n-1))
						{
							route[m][n] = Math.max(route[m-1][n-1]+1, Math.max(route[m][n-1], route[m-1][n]));
						}
						else
						{
							route[m][n] = Math.max(route[m][n-1], route[m-1][n]);
						}
						/*route[m][n] = Math.max(route[m-1][n-1]
						              + score[CharToNum(seq.get(i).charAt(m-1))][CharToNum(seq.get(j).charAt(n-1))], 
								              Math.max(route[m][n-1] + score[CharToNum('-')][CharToNum(seq.get(j).charAt(n-1))], 
								    		  route[m-1][n] + score[CharToNum(seq.get(i).charAt(m-1))][CharToNum('-')]));*/
						if(route[m][n] == route[m][n-1])
						{
							opera[m][n] = 1;
						}
						else if(route[m][n] == route[m-1][n])
						{
							opera[m][n] = 2;
						}
						else
						{
							opera[m][n] = 3;
						}
						/*if(route[m][n] == route[m][n-1] + score[CharToNum('-')][CharToNum(seq.get(j).charAt(n-1))])
						{
							opera[m][n] = 1;
						}
						else if(route[m][n] == route[m-1][n] + score[CharToNum(seq.get(i).charAt(m-1))][CharToNum('-')])
						{
							opera[m][n] = 2;
						}
						else
						{
							opera[m][n] = 3;
						}*/
					}
				}
				System.out.println("------------route start-------------");
				print(route);
				System.out.println("-------------route end-----------\n");
				System.out.println("------------opera start-------------");
				print(opera);
				System.out.println("-------------opera end-----------\n");
				BackTracking(opera,seq.get(i),opera.length-1,opera[0].length-1);
			}
		}
	}
	
	public void print(double[][] matrix)
	{
		DecimalFormat df = new DecimalFormat("0.0");
		for(int i = 0;i < matrix.length;i++)
		{
			for(int j = 0;j < matrix[i].length;j++)
			{
				System.out.print(df.format(matrix[i][j]) + " ");
			}
			System.out.println();
		}
	}

	public void BackTracking(double[][] matrix,String s,int i,int j)
	{
		if(i == 0 || j == 0)
		{
			return;
		}
		else if(matrix[i][j] == 3)
		{
			BackTracking(matrix,s,i-1,j-1);
			System.out.print(s.charAt(i-1));
		}
		else if (matrix[i][j] == 2)
		{
			BackTracking(matrix,s,i-1,j);
		}
		else
		{
			BackTracking(matrix,s,i,j-1);
		}
			
	}
	
	public int CharToNum(char C)
	{
		int k = -1;
		if(C == 'A')
		{
			k = 0;
		}
		else if(C == 'G')
		{
			k = 1;
		}
		else if(C == 'C')
		{
			k = 2;
		}
		else if(C == 'T')
		{
			k = 3;
		}
		else if(C == '-')
		{
			k = 4;
		}
		return k;
	}
	
	public void Run()
	{		
		ReadFile();
		Alignment();
	}
}
