package c;

public class FullCross {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		double[][] Q = new double[][]{{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		
		double[][] temp = new double[Q.length][Q[0].length];
		int record = 0, k = 0;
		for (int i = 0; i < Q.length / 2; i++)
        {
			record = k;
			for (int j = 0; j < Q[0].length; j++, k++) 
			{
				temp[(k % (Q.length / 2)) * 2][j] = Q[2 * i][j];
				temp[(k % (Q.length / 2)) * 2 + 1][j] = Q[2 * i + 1][j];
			}
			record++;//�����ʼд����k = record++������������������⣬k��ֵ��ȻΪrecord��������record++���ֵ��
			k = record;
			//k = ++record;//����дk = ++record�Ľ�������������д�Ľ��һ�£��´�д��ʱ��Ҫע��������⡣
		}
		
		for(int i = 0;i < Q.length;i++)
		{
			for(int j = 0;j < Q[0].length;j++)
			{
				System.out.print(Q[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		for(int i = 0;i < temp.length;i++)
		{
			for(int j = 0;j < temp[0].length;j++)
			{
				System.out.print(temp[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		/*char[][] Q = new char[][]{{'A','A','A','A','A','A','A','A','A'},{'B','B','B','B','B','B','B','B','B'},{'C','C','C','C','C','C','C','C','C'},{'D','D','D','D','D','D','D','D','D'},{'E','E','E','E','E','E','E','E','E'}};
		//double[][] Q = new double[][]{{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        char[][] temp = new char[Q.length][Q[0].length];
		int record = 0, k = 0;
		for (int i = 0; i < Q.length; i++)
        {
			record = k;
			for (int j = 0; j < Q[0].length; j++, k++) 
			{
				temp[(k % (Q.length))][j] = Q[i][j];	
			}
			record++;//�����ʼд����k = record++������������������⣬k��ֵ��ȻΪrecord��������record++���ֵ��
			k = record;
			//k = ++record;//����дk = ++record�Ľ�������������д�Ľ��һ�£��´�д��ʱ��Ҫע��������⡣
		}
		
		for(int i = 0;i < Q.length;i++)
		{
			for(int j = 0;j < Q[0].length;j++)
			{
				System.out.print(Q[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		System.out.println("------------------------------------");
		
		for(int i = 0;i < temp.length;i++)
		{
			for(int j = 0;j < temp[0].length;j++)
			{
				System.out.print(temp[i][j] + " ");
			}
			System.out.println("\n");
		}*/



	}

}
