package b;

public class QuanPaiLie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p = new int[]{1,5,3};
		
		//showPermutation(p, p.length);
		
		while(nextPermutation(p, p.length))
	    {
	       showPermutation(p, p.length);
	       System.out.print("\n");
	    }

		

	}
	
	public static boolean nextPermutation(int[] p, int n)
	{
	    int last = n - 1;
	    int i, j, k;
	 
	    //�Ӻ���ǰ���ң�����û�к����������ǰ������������������ͣ�ں�һ������λ�á�
	    i = last;
	    while (i > 0 && p[i] < p[i - 1])
	       i--;
	    //��û�к����������ǰ������������˵���Ѿ��������һ�����У�����false��
	    if (i == 0)
	       return false;
	 
	    //�Ӻ�鵽i�����Ҵ���p[i - 1]����С����������k
	    k = i;
	    for (j = last; j >= i; j--)
	       if (p[j] > p[i - 1] && p[j] < p[k])
	           k = j;
	    //����p[k]��p[i - 1]
	    //swap(p[k], p[i - 1]);
	    int temp = p[k];
	    p[k] = p[i-1];
	    p[i-1] = temp;
	    //����p[last]��p[i]
	    for (j = last, k = i; j > k; j--, k++)
	    //swap(p[j], p[k]);
	    {
	    	temp = p[j];
		    p[j] = p[k];
		    p[k] = temp;
	    }
	 
	    return true;
	}
	
	public static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void showPermutation(int[] p, int n)
	{
	    for (int i = 0; i < n; i++)
	      System.out.print(p[i] + " ");
	}


}
